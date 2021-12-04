package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.business.validationRules.StudentValidatorService;
import project.courseManagementSystem.core.email.EmailCheckService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.StudentDao;
import project.courseManagementSystem.entities.concretes.Student;
import project.courseManagementSystem.entities.dtos.UserForLoginDto;

@Service
public class StudentManager implements StudentService {

	private StudentDao studentDao;
	private StudentValidatorService studentValidatorService;
	private EmailCheckService emailCheckService;
	private UserService userService;

	@Autowired
	public StudentManager(StudentDao studentDao, StudentValidatorService studentValidatorService,
			EmailCheckService emailCheckService, UserService userService) {
		super();
		this.studentDao = studentDao;
		this.studentValidatorService = studentValidatorService;
		this.emailCheckService = emailCheckService;
		this.userService = userService;
	}

	@Override
	public Result register(Student student) {

		// refactor: (findByEmail( student.getEmail()) ).getData() != null
		//returns true if saved to database:
		if (userService.existsByEmail(student.getEmail())) {
			return new ErrorResult("this student is already exist");
		}

		if (!studentValidatorService.checkIfStudentInfoIsFull(student)) {
			return new ErrorResult("enter all your information completely");
		}
		
		if (!emailCheckService.emailCheck(student.getEmail())) {
			return new ErrorResult("invalid email");
		}
		
		
		//String hashedPassword = passwordEncoderService.hashPassword(student.getPassword());
		//student.setPassword(hashedPassword);
		studentDao.save(student);
		
		return new SuccessResult("Successfully registered");

	}
	
	@Override
	public Result login(UserForLoginDto userForLoginDto) {
		//TO DO
		
		//burada kullanıcıdan gelen passwordu hashliyoruz
		//BCryptPasswordEncoder ---->
		//kullanıcının şifresini kodlamak için, böylece şifrenin kendisi veritabanında saklanmaz (daha iyi güvenlik için) – sadece şifrenin karma değeri saklanır.
		//Implementation of PasswordEncoder that uses the BCrypt strong hashing function
		//  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		//encode() --->  Encode the raw password. 
		//Generally, a good encoding algorithm applies a SHA-1 orgreater hash 
		//combined with an 8-byte or greater randomly generated salt
		//  String encodedPassword = passwordEncoder.encode(userForLoginDto.getPassword());
		//  userForLoginDto.setPassword(encodedPassword);
		
		return new SuccessResult("succesfully login");
	}

	@Override
	public Result add(Student entity) {
		studentDao.save(entity);
		return new SuccessResult("Student added!");
	}

	@Override
	public Result delete(int id) {
		if (getById(id).getData() == null) {
			return new ErrorResult("Student is not exist!");
		}
		studentDao.deleteById(id);
		return new SuccessResult("Student deleted!");
	}

	@Override
	public Result update(Student entity) {
		Student updatedStudent = getById(entity.getId()).getData();

		updatedStudent.setEmail(entity.getEmail());
		updatedStudent.setBirthDate(entity.getBirthDate());
		updatedStudent.setFirstName(entity.getFirstName());
		updatedStudent.setGender(entity.getGender());
		updatedStudent.setLastName(entity.getLastName());
		updatedStudent.setNationalityId(entity.getNationalityId());
		updatedStudent.setPassword(entity.getPassword());
		updatedStudent.setPhoneNumber(entity.getPhoneNumber());
		updatedStudent.setSchoolName(entity.getSchoolName());

		studentDao.save(updatedStudent);
		return new SuccessResult("Student updated!");
	}

	@Override
	public DataResult<Student> getById(int id) {
		Student student = studentDao.findById(id);
		if (student == null) {
			return new ErrorDataResult<Student>(null, "Student is not exist!");
		}
		return new SuccessDataResult<Student>(student, "Student viewed!");
	}

	@Override
	public DataResult<List<Student>> getAll() {
		return new SuccessDataResult<List<Student>>(studentDao.findAll(), "Students listed");
	}

	@Override
	public DataResult<Student> getByEmail(String email) {
		for (Student student : studentDao.findAll()) {
			if ((student.getEmail()).equals(email)) {
				return new SuccessDataResult<Student>(student, "student listed");
			}
		}
		return new ErrorDataResult<Student>(null, "student is not exist");
	}

	@Override
	public DataResult<List<Student>> getAllByCourse_Id(int courseId) {
		return new SuccessDataResult<List<Student>>(studentDao.getAllByCourse_Id(courseId), "Students listed");
	}

}

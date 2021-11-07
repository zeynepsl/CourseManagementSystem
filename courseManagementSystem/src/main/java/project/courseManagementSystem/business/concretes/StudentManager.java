 package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.business.validationRules.StudentValidatorService;
import project.courseManagementSystem.core.adapters.mernis.UserCheckService;
import project.courseManagementSystem.core.email.EmailCheckService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.StudentDao;
import project.courseManagementSystem.entities.concretes.Student;

@Service
public class StudentManager implements StudentService{

	private StudentDao studentDao;
	private StudentValidatorService studentValidatorService;
	private UserCheckService userCheckService;
	private EmailCheckService emailCheckService;
	private UserService userService;
	
	@Autowired
	public StudentManager(StudentDao studentDao, StudentValidatorService studentValidatorService,
			UserCheckService userCheckService, EmailCheckService emailCheckService, UserService userService) {
		super();
		this.studentDao = studentDao;
		this.studentValidatorService = studentValidatorService;
		this.userCheckService = userCheckService;
		this.emailCheckService = emailCheckService;
		this.userService = userService;
	}

	
	
	public Result register(Student student) {
		
		if(!emailCheckService.emailCheck(student.getEmail())) {
			return new ErrorResult("invalid email");
		}
		
		if(!studentValidatorService.checkIfStudentInfoIsFull(student)) {
			return new ErrorResult("enter all your information completely");		
		}
		
		//refactor:
		if( (findByEmail( student.getEmail()) ).getData() != null) {
			return new ErrorResult("this student is already exist");
		}
		
		add(student);
		return new SuccessResult("Successfully registered");
		
	}
	
	
	@Override
	public Result add(Student entity) {
		studentDao.save(entity);
		return new SuccessResult("Student added!");
	}
	

	@Override
	public Result delete(int id) {
		if(getById(id).getData() == null) {
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
		if(student == null) {
			return new ErrorDataResult<Student>(null, "Student is not exist!");
		}
		return new SuccessDataResult<Student>(student, "Student viewed!");
	}

	@Override
	public DataResult<List<Student>> getAll() {
		return new SuccessDataResult<List<Student>>(studentDao.findAll(), "Students listed");
	}

	
	@Override
	public DataResult<Student> findByEmail(String email) {
		for(Student student : studentDao.findAll()) {
			if( (student.getEmail()).equals(email)) {
				return new SuccessDataResult<Student>(student, "student listed");
			}
		}
		return new ErrorDataResult<Student>(null, "student is not exist");
	}
	
	private boolean checkIfStudentExist(int id) {
		Student student = studentDao.findById(id);
		if(student == null) {
			return false;
		}
		return true;
	}


	

}

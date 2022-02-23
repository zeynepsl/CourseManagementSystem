package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.AuthService;
import project.courseManagementSystem.business.abstracts.CourseService;
import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.business.validationRules.InstructorValidatorService;
import project.courseManagementSystem.business.validationRules.StudentValidatorService;
import project.courseManagementSystem.core.email.EmailCheckService;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.concretes.Student;
import project.courseManagementSystem.entities.dtos.InstructorDto;
import project.courseManagementSystem.entities.dtos.LoginDto;
import project.courseManagementSystem.entities.dtos.StudentDto;

@Service
public class AuthManager implements AuthService {

	private UserService userService;
	private StudentService studentService;
	private CourseService courseService;
	private InstructorService instructorService;

	private StudentValidatorService studentValidatorService;
	private InstructorValidatorService instructorValidatorService;

	private EmailCheckService emailCheckService;

	private AuthenticationManager authenticationManager;
	private PasswordEncoder passwordEncoder;

	@Autowired
	public AuthManager(UserService userService, StudentService studentService,
			CourseService courseService, InstructorService instructorService,
			StudentValidatorService studentValidatorService, InstructorValidatorService instructorValidatorService,
			EmailCheckService emailCheckService, AuthenticationManager authenticationManager,
			PasswordEncoder passwordEncoder) {
		super();
		this.userService = userService;
		this.studentService = studentService;	
		this.courseService = courseService;
		this.instructorService = instructorService;
		this.studentValidatorService = studentValidatorService;
		this.instructorValidatorService = instructorValidatorService;
		this.emailCheckService = emailCheckService;
		this.authenticationManager = authenticationManager;
		this.passwordEncoder = passwordEncoder;
	}

	public AuthManager() {
	}

	@Override
	public DataResult<User> login(LoginDto loginDto) {
		try {
			User userToCheck = userService.findByEmail(loginDto.getEmail()).getData();
			if (userToCheck == null) {
				return new ErrorDataResult<User>(null, "user not found");
			}

			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);
			return new SuccessDataResult<User>(userToCheck, "User login successfully");
		} catch (Exception e) {
			return new ErrorDataResult<User>(null, "wrong password");
		}

	}

	@Override
	public Result registerForStudent(StudentDto studentDto) {

		if (userService.existsByEmail(studentDto.getEmail())) {
			return new ErrorResult("this student is already exist");
		}

		if (!studentValidatorService.checkIfStudentInfoIsFull(studentDto)) {
			return new ErrorResult("enter all your information completely");
		}

		if (!emailCheckService.emailCheck(studentDto.getEmail())) {
			return new ErrorResult("invalid email");
		}

		if (userService.existByUsername(studentDto.getUsername())) {
			return new ErrorResult("Username is already taken!");
		}
		List<Student> students = studentService.getAllByCourse_Id(studentDto.getCourseId()).getData();
		if(students.size() > 5) {
			return new ErrorResult("bir ders programında(kursta) en fazla 4 ogrenci olabilir");
		}
		Student student = new Student();

		student.setBirthDate(studentDto.getBirthDate());
		student.setEmail(studentDto.getEmail());
		student.setFirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setGender(studentDto.getGender());
		student.setNationalityId(studentDto.getNationalityId());
		student.setPhoneNumber(studentDto.getPhoneNumber());
		student.setSchoolName(studentDto.getSchoolName());
		student.setUsername(studentDto.getUsername());

		Course course = courseService.getById(studentDto.getCourseId()).getData();
	
		student.setCourse(course);

		student.setPassword(passwordEncoder.encode(studentDto.getPassword()));

		// ilgili öğrenciye ilgili rolü atamayi UaserManager da yapiyoruz
		studentService.add(student);

		return new SuccessResult("Successfully registered");
	}

	@Override
	public Result registerForInstructor(InstructorDto instructorDto) {
		if (userService.existsByEmail(instructorDto.getEmail())) {
			return new ErrorResult("instructor is already exist, taken");
		}

		if (userService.existByUsername(instructorDto.getUsername())) {
			return new ErrorResult("Username is already taken!");
		}

		if (!instructorValidatorService.checkIfInstructorInfoIsFull(instructorDto)) {
			return new ErrorResult("enter all your information completely and accurately");
		}

		if (!emailCheckService.emailCheck(instructorDto.getEmail())) {
			return new ErrorResult("invalid email");
		}

		Instructor instructor = new Instructor();

		instructor.setBirthDate(instructorDto.getBirthDate());
		instructor.setDepartmentName(instructorDto.getDepartmentName());
		instructor.setEmail(instructorDto.getEmail());
		instructor.setFirstName(instructorDto.getFirstName());
		instructor.setLastName(instructorDto.getLastName());
		instructor.setNationalityId(instructorDto.getNationalityId());
		instructor.setPhoneNumber(instructorDto.getPhoneNumber());
		instructor.setUsername(instructorDto.getUsername());
		instructor.setPassword(passwordEncoder.encode(instructorDto.getPassword()));

		// ilgili egitmene;
		// ilgili kursu atamayi CourseManger da, ilgili rolü atamayi UaserManager da yapiyoruz

		instructorService.add(instructor);
		return new SuccessResult("Successfully registered");
	}

}

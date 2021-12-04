package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.CourseService;
import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.business.validationRules.CourseValidatorService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.CourseDao;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.dtos.CourseInfoDto;

@Service
public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private CourseValidatorService courseValidatorService;
	private InstructorService instructorService;

	@Autowired
	public CourseManager(CourseDao courseDao, CourseValidatorService courseValidatorService,
			InstructorService instructorService) {
		super();
		this.courseDao = courseDao;
		this.courseValidatorService = courseValidatorService;
		this.instructorService = instructorService;
	}

	@Override
	public Result add(Course entity) {
		try {
			if (!courseValidatorService.checkIfCourseInfoIsFull(entity)) {
				return new ErrorResult("enter course's all information completely");
			}
			
			courseDao.save(entity);
			return new SuccessResult("course added");
		} 
		catch (NullPointerException ex) {
			return new ErrorResult(ex.toString());
		}
		catch (HttpMessageNotReadableException ex) {
			return new ErrorResult(ex.toString());
		}
		catch (Exception e) {
			return new ErrorResult(e.toString());
		}

	}
	
	// ---REFACTOR---
	@Override
	public Result addCourseWithAllInfo(CourseInfoDto courseInfoDto) {
		//
		return new SuccessResult("");
	
	} 
	
	//Course course1 = getById(courseInfoDto.getId()).getData();
	/*
	 Course course = new Course();
	
	course.setName(courseInfoDto.getName());
	course.setStartDate(courseInfoDto.getStartDate());
	course.setEndDate(courseInfoDto.getEndDate());
	
	for(int ınstructorId : courseInfoDto.getInstructorIds()) {
		Instructor instructor = instructorService.getById(ınstructorId).getData();
		course.getEnrolledInstructors().add(instructor);
	}
	
	for(int lessonId : courseInfoDto.getLessonIds()) {
		Lesson lesson = lessonService.getById(lessonId).getData();
		course.getLessons().add(lesson);
	}
	
	for(int studentId : courseInfoDto.getStudentIds()) {
		Student student = studentService.getById(studentId).getData();
		course.getStudents().add(student);
	}
	
	courseDao.save(course);
	 */
	
	@Override
	public DataResult<CourseInfoDto> getAllInfo(int courseId){
		Course course = getById(courseId).getData();
		List<Instructor> instructors = course.getEnrolledInstructors();
		
		CourseInfoDto courseInfoDto = new CourseInfoDto();
		
		courseInfoDto.setName(course.getName());
		courseInfoDto.setStartDate(course.getStartDate());
		courseInfoDto.setEndDate(course.getEndDate());
		courseInfoDto.setInstructors(instructors);
		
		return new SuccessDataResult<CourseInfoDto>(courseInfoDto, "viewed!");
	}
	

	@Override
	public Result delete(int id) {
		try {
			if(getById(id).getData() == null) {
				return new ErrorResult("course is not exist");
			}
			courseDao.deleteById(id);
			return new SuccessResult("course deleted");
		} 
		//Veri Bütünlüğü İhlali İstisnası:
		//eğer silmek istediğim kurs, 
		//kendisi ile ilişkili olan tablolarda kayıtlı ise ve ben de onu silmeye çalışıyorsam:
		catch (DataIntegrityViolationException ex) {
			return new ErrorResult(ex.getMessage());
			//"message": "could not execute statement; SQL [n/a]; constraint [null];
			// nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement"
		}
		
	}

	@Override
	public Result update(Course entity) {
		courseDao.save(entity);
		return new SuccessResult("course updated");
	}

	@Override
	public DataResult<Course> getById(int id) {
		Course course = courseDao.findById(id);
		if(course == null) {
			return new ErrorDataResult<Course>(null, "course is not exist");
		}
		return new SuccessDataResult<Course>(course, "course viewed");
	}

	@Override
	public DataResult<List<Course>> getAll() {
		return new SuccessDataResult<List<Course>>(courseDao.findAll(), "courses listed");
	}
	
	
	public Result addInstructorToCourse(int instructorId, int courseId) {
		Instructor instructor = instructorService.getById(instructorId).getData();
		Course course = getById(courseId).getData();
		course.getEnrolledInstructors().add(instructor);
		courseDao.save(course);
		return new SuccessResult("kaydetme başarılı");
	}
	


}

package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.CourseRatingservice;
import project.courseManagementSystem.business.abstracts.CourseService;
import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.CourseRatingDao;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.concretes.CourseRating;
import project.courseManagementSystem.entities.concretes.CourseRatingKey;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

@Service
public class CourseRatingManager implements CourseRatingservice{

	private CourseRatingDao courseRatingDao;
	private InstructorService instructorService;
	private CourseService courseService;
	
	@Autowired
	public CourseRatingManager(CourseRatingDao courseRatingDao, InstructorService instructorService, CourseService courseService) {
		super();
		this.courseRatingDao = courseRatingDao;
		this.instructorService = instructorService;
		this.courseService = courseService;
	}

	

	@Override
	public 	DataResult<List<CourseRating>> getAllByCourse_Id(int courseId) {
		return new SuccessDataResult<List<CourseRating>>(courseRatingDao.findAll(), "listed");
	}

	@Override
	public Result addInstructorToCourse(int instructorId, int courseId) {
		Instructor instructor = instructorService.getById(instructorId).getData();
		Course course = courseService.getById(courseId).getData();
		CourseRating courseRating = new CourseRating();
		CourseRatingKey key = new CourseRatingKey(instructorId, courseId);
		courseRating.setId(key);
		courseRating.setInstructor(instructor);
		courseRating.setCourse(course);
		courseRatingDao.save(courseRating);
		return new SuccessResult("eklendi");
	}

	@Override
	public DataResult<List<CoursesWithInstructorDto>> fetchDataInnerJoin() {
		//courseRatingDao.fetchDataInnerJoin()
		return new SuccessDataResult<List<CoursesWithInstructorDto>>(null, "listed");
	}

}

package project.courseManagementSystem.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.CourseRatingservice;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;

@Service
public class CourseRatingManager implements CourseRatingservice{


	
	@Autowired
	public CourseRatingManager() {
		super();
	}


	@Override
	public Result addInstructorToCourse(int instructorId, int courseId) {
		/*	Instructor instructor = instructorService.getById(instructorId).getData();
		Course course = courseService.getById(courseId).getData();
		CourseInstructor courseRating = new CourseInstructor();
		CourseRatingKey key = new CourseRatingKey(instructorId, courseId);
		//courseRating.setId(key);
		courseRating.setInstructor(instructor);
		courseRating.setCourse(course);
		courseRatingDao.save(courseRating);*/
		return new SuccessResult("eklendi");
	
	}

}

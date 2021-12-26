package project.courseManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.CourseRatingservice;
import project.courseManagementSystem.core.utilities.results.Result;

@RestController
@RequestMapping("/api/ratings")
public class CourseRatingController {
	private CourseRatingservice courseRatingservice;

	@Autowired
	public CourseRatingController(CourseRatingservice courseRatingservice) {
		super();
		this.courseRatingservice = courseRatingservice;
	}
	@PostMapping("/addInstructorToCourse")
	public Result addInstructorToCourse(int instructorId, int courseId) {
		return courseRatingservice.addInstructorToCourse(instructorId, courseId);
	}
	
}

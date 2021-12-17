package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.CourseRatingservice;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.CourseRating;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

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
	
	@GetMapping("/getAllByCourse_Id")
	public DataResult<List<CourseRating>> getAllByCourse_Id(int courseId){
		return courseRatingservice.getAllByCourse_Id(courseId);
	}
	
	@GetMapping("fetchDataInnerJoin")
	public DataResult<List<CoursesWithInstructorDto>> fetchDataInnerJoin(){
		return courseRatingservice.fetchDataInnerJoin();
	} 
}

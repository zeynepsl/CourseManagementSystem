package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.CourseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.dtos.CourseInfoDto;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Course course) {
		return courseService.add(course);
	}
	
	@PostMapping("/delete")
	public Result delete(int id) {
		return courseService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Course course) {
		return courseService.update(course);
	}
	
	@GetMapping("/getById")
	public DataResult<Course> getById(int id) {
		return courseService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Course>> getAll() {
		return courseService.getAll();
	}
	
	@GetMapping("/getAllInfo")
	public DataResult<CourseInfoDto> getAllInfo(int courseId){
		return courseService.getAllInfo(courseId);
	}
	
	@PutMapping(("/{courseId}/instructor/{instructorId}"))
	public Result addInstructorToCourse(int instructorId, int courseId) {
		return courseService.addInstructorToCourse(instructorId, courseId);
	}
	/*
	 	@PostMapping("addCourseWithAllInfo")
	public Result addCourseWithAllInfo(@RequestBody CourseInfoDto courseInfoDto) {
		return courseService.addCourseWithAllInfo(courseInfoDto);
	}
	 */

	/*	@PutMapping("{courseId}/instructors/{userId}")
	public DataResult<Course> enrollInstructorToCourse(
			@PathVariable int courseId,
			@PathVariable int userId) {
		Course course = courseService.getById(courseId).getData();
		Instructor instructor = instructorService.getById(userId).getData();
		course.getInstructors().add(instructor);
		courseService.add(course);
		return new SuccessDataResult<Course>(course,"added");
	}
	 * */

}

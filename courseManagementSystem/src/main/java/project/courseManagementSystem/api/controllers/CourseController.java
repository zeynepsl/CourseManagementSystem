package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
import project.courseManagementSystem.entities.dtos.CourseDto;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public CourseController(@Lazy CourseService courseService) {
		this.courseService = courseService;
	}
	
	@PostMapping("/save")
	public Result save(@RequestBody CourseDto course) {
		return courseService.save(course);
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
	
	@PutMapping(("/{courseId}/instructor/{instructorId}"))
	public Result addInstructorToCourse(int instructorId, int courseId) {
		return courseService.addInstructorToCourse(instructorId, courseId);
	}
	
	@PutMapping("/{courseId}/lesson/{lessonId}")
	public Result addLessonToCourse(int lessonId, int courseId) {
		return courseService.addLessonToCourse(lessonId, courseId);
	}
	
	@GetMapping("/findByName")
	public DataResult<List<Course>> findByName(String name){
		return courseService.findByName(name);
	}
	

}

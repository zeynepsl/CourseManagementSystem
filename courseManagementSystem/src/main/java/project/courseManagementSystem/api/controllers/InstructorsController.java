package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

@RestController
@RequestMapping("/api/instructors")
public class InstructorsController {
	private InstructorService instructorService;

	@Autowired
	public InstructorsController(@Lazy InstructorService instructorService) {
		this.instructorService = instructorService;
	}
	
	@PostMapping("/delete")
	public Result delete(int id) {
		return instructorService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Instructor instructor) {
		return instructorService.update(instructor);
	}
	
	@GetMapping("/getById")
	public DataResult<Instructor> getById(int id) {
		return instructorService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Instructor>> getAll() {
		return instructorService.getAll();
	}
	
	// --- TO DO ---
	@PostMapping("/addInstructorToCourse")
	public Result addInstructorToCourse(@RequestParam int instructorId,@RequestParam int courseId) {
		return instructorService.addInstructorToCourse(instructorId, courseId);
	}
	
	@GetMapping("getAllCoursesByInstructorId")
	public DataResult<CoursesWithInstructorDto> getAllCoursesByInstructorId(@RequestParam int instructorId){
		return instructorService.getAllCoursesByInstructorId(instructorId);
	}
	
}

package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Instructor;

@RestController
@RequestMapping("/api/instructors")
public class InstructorsController {
	private InstructorService instructorService;

	@Autowired
	public InstructorsController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody Instructor instructor) {
		return instructorService.register(instructor);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Instructor instructor) {
		return instructorService.add(instructor);
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
	public Result getById(int id) {
		return instructorService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Instructor>> getAll() {
		return instructorService.getAll();
	}
	
}

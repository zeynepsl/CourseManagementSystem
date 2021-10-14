package project.courseManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Student;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
	private StudentService studentService;

	@Autowired
	public StudentsController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Student student) {
		return studentService.add(student);
	}
	
	@PostMapping("/delete")
	public Result delete(Student student) {
		return studentService.delete(student);
	}
	
	@PostMapping("/update")
	public Result update(Student student) {
		return studentService.update(student);
	}
	
	@GetMapping("/getById")
	public Result getById(int id) {
		return studentService.getById(id);
	}
	
	@GetMapping("/getAll")
	public Result getAll() {
		return studentService.getAll();
	}
}
package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.core.utilities.results.DataResult;
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
	
	@PostMapping("/register")
	public Result register(@RequestBody Student student) {
		return studentService.register(student);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return studentService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@GetMapping("/getById")
	public DataResult<Student> getById(int id) {
		return studentService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Student>> getAll() {
		return studentService.getAll();
	}
	
	@GetMapping("/getByEmail")
	public DataResult<Student> getByEmail(String email){
		return studentService.getByEmail(email);
	}
}

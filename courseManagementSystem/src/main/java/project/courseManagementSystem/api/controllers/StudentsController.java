package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.StudentService;
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
	
	public List<Student> getAll() {
		return studentService.getAll();
	}
}

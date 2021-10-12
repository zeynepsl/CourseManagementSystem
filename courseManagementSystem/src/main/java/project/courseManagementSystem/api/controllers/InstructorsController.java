package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.InstructorService;
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
	
	public List<Instructor> getAll(){
		return instructorService.getAll();
	}
}

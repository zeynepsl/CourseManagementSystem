package project.courseManagementSystem.api.controllers;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.AuthService;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.dtos.InstructorDto;
import project.courseManagementSystem.entities.dtos.LoginDto;
import project.courseManagementSystem.entities.dtos.StudentDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		this.authService = authService;
	} 
	
	@PostMapping("/login")
	public DataResult<User> login(@RequestBody LoginDto loginDto){
		return this.authService.login(loginDto);
	}
	
	@PostMapping("/registerForStudent")
	public Result registerForStudent(@RequestBody StudentDto studentDto){
		return this.authService.registerForStudent(studentDto);
	}
	
	@PostMapping("/registerForInstructor")
	public Result registerForInstructor(@RequestBody InstructorDto instructorDto){
		return this.authService.registerForInstructor(instructorDto);
	}
    
}

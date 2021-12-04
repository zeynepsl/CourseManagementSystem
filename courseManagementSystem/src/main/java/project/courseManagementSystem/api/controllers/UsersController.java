package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PostMapping("/delete")
	public Result delete(int id) {
		return userService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(User user) {
		return userService.update(user);
	}
	
	@GetMapping("/getById")
	public DataResult<User> getById(int id) {
		return userService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("findByEmail")
	public DataResult<User> findByEmail(@RequestParam String email){
		return userService.findByEmail(email);
	}
}

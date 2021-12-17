package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.RoleService;
import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
	
	private RoleService roleService;
	
	@Autowired
	public RoleController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Role role) {
		return roleService.add(role);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return roleService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Role role) {
		return roleService.update(role);
	}
	
	@GetMapping("/getById")
	public DataResult<Role> getById(int id) {
		return roleService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Role>> getAll() {
		return roleService.getAll();
	}
}

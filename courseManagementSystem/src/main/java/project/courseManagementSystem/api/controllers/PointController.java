package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.PointService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Point;
import project.courseManagementSystem.entities.dtos.PointDto;

@RestController
@RequestMapping("/api/points")
public class PointController {
	private PointService pointService;

	@Autowired
	public PointController(PointService pointService) {
		super();
		this.pointService = pointService;
	}
	
	@PostMapping("/save")
	public Result save(@RequestBody PointDto point) {
		return pointService.save(point);
	}
	
	@PostMapping("/delete")
	public Result delete(int id) {
		return pointService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Point point) {
		return pointService.update(point);
	}
	
	@GetMapping("/getById")
	public DataResult<Point> getById(int id) {
		return pointService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Point>> getAll() {
		return pointService.getAll();
	}
}

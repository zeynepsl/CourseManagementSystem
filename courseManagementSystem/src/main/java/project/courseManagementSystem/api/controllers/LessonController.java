package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.LessonService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Lesson;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {
	private LessonService lessonService;
	
	@Autowired
	public LessonController(LessonService lessonService) {
		super();
		this.lessonService = lessonService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Lesson lesson) {
		return lessonService.add(lesson);
	}
	
	@PostMapping("/delete")
	public Result delete(int id) {
		return lessonService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Lesson lesson) {
		return lessonService.update(lesson);
	}
	
	@GetMapping("/getById")
	public DataResult<Lesson> getById(int id) {
		return lessonService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Lesson>> getAll() {
		return lessonService.getAll();
	}
	
	
}

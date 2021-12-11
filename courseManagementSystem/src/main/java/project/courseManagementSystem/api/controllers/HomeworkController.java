package project.courseManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.business.abstracts.HomeworkService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Homework;

@RestController
@RequestMapping("/api/homeworks")
public class HomeworkController {
	private HomeworkService homeworkService;
	
	@Autowired
	public HomeworkController(HomeworkService homeworkService) {
		super();
		this.homeworkService = homeworkService;
	}
	
	/*
	 @PostMapping("/upload")
	public Result upload
	       (@RequestParam(value = "name") String name, 
	    		   @RequestBody Homework homework,
	    		   @RequestParam(value = "hwFile") MultipartFile hwFile) throws IOException {
		//Homework homework = new Homework();
		return homeworkService.upload(homework, hwFile);
	}
	 */
	
	@RequestMapping(value = "/schedulebatch",method = RequestMethod.POST)
			public @ResponseBody Result add(@RequestPart("upfile") MultipartFile upfile) throws Exception {  
		Homework homework = new Homework();
		return homeworkService.upload(homework, upfile);
		}
	
	@PostMapping("/delete")
	public Result delete(@Param(value = "id") int id) {
		return homeworkService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Homework homework) {
		return homeworkService.update(homework);
	}
	
	@GetMapping("/getById")
	public DataResult<Homework> getById(int id) {
		return homeworkService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Homework>> getAll() {
		return homeworkService.getAll();
	}
}

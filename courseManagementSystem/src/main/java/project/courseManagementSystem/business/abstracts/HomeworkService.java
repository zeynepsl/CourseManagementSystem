package project.courseManagementSystem.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Homework;

public interface HomeworkService extends BaseService<Homework> {
	public Result upload(Homework homework, MultipartFile file);
}

package project.courseManagementSystem.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.fileUpload.payload.Response;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.entities.concretes.Homework;

public interface HomeworkService extends BaseService<Homework> {
	public DataResult<Response> upload(MultipartFile file, int studentId);
}

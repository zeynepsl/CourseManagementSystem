package project.courseManagementSystem.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.business.abstracts.HomeworkService;
import project.courseManagementSystem.core.utilities.fileUpload.FileService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.HomeworkDao;
import project.courseManagementSystem.entities.concretes.Homework;

@Service
public class HomeworkManager implements HomeworkService{

	private HomeworkDao homeworkDao;
	private FileService fileService; 
	
	@Autowired
	public HomeworkManager(HomeworkDao homeworkDao, FileService fileService) {
		this.homeworkDao = homeworkDao;
		this.fileService = fileService;
	}
	
	@Override
	public Result upload(Homework homework, MultipartFile file) {
		@SuppressWarnings("unchecked")
		Map<String,String> uploadImage = 
		(Map<String, String>) this.fileService.fileUpload(file).getData();
		homework.setUrl(uploadImage.get("url"));
		this.homeworkDao.save(homework);
		return new SuccessResult(" added");
		///return add(imageCV);
	}
	
	@Override
	public Result add(Homework entity) {
		homeworkDao.save(entity);
		return new SuccessResult(" eklendi");
	}

	@Override
	public Result delete(int id) {
		Homework homework = getById(id).getData();
		if(homework == null) {
			return new ErrorResult("homework is not exist");
		}
		homeworkDao.deleteById(id);
		return new SuccessResult("deleted");
	}

	@Override
	public Result update(Homework entity) {
		Homework updatedHomework = getById(entity.getId()).getData();
		
		updatedHomework.setUrl(entity.getUrl());
		
		homeworkDao.save(entity);
		return new SuccessResult("updated");
	}

	@Override
	public DataResult<Homework> getById(int id) {
		Homework homework = homeworkDao.findById(id);
		if(homework == null) {
			return new ErrorDataResult<Homework>(null, "homework is not exist");
		}
		return new SuccessDataResult<Homework>(homework, "homework viewed");
	}

	@Override
	public DataResult<List<Homework>> getAll() {
		return new SuccessDataResult<List<Homework>>(homeworkDao.findAll(), "listed");
	}


}

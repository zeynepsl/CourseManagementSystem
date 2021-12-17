package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import project.courseManagementSystem.business.abstracts.HomeworkService;
import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.core.utilities.fileUpload.payload.Response;
import project.courseManagementSystem.core.utilities.fileUpload.service.FileStorageService;
import project.courseManagementSystem.core.utilities.imageUpload.FileService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.HomeworkDao;
import project.courseManagementSystem.entities.concretes.Homework;
import project.courseManagementSystem.entities.concretes.Student;

@Service
public class HomeworkManager implements HomeworkService{

	private HomeworkDao homeworkDao;
	private FileStorageService fileStrorageService;
	private StudentService studentService;
	
	@Autowired
	public HomeworkManager(HomeworkDao homeworkDao, FileStorageService fileStrorageService,
			StudentService studentService) {
		this.homeworkDao = homeworkDao;
		this.fileStrorageService = fileStrorageService;
		this.studentService = studentService;
	}
	
	@Override
	public DataResult<Response> upload(MultipartFile file, int studentId) {
		String fileName = fileStrorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        Homework homework = new Homework();
        homework.setFileName(fileName);
        homework.setUploadDir(fileDownloadUri);
        homework.setFileType(file.getContentType());
        Student student = studentService.getById(studentId).getData();
        homework.setStudent(student);
        homework.setPoint(null);
        
        //byte[] b = BigInteger.valueOf(file.getSize()).toByteArray();
        //databaseFile.setSize(BigInteger.valueOf(file.getSize()).toByteArray());
        //var l = new BigInteger(b);
        
        homeworkDao.save(homework);
        Response response = new Response(fileName, fileDownloadUri, file.getContentType(), file.getSize());
        return new SuccessDataResult<Response>(response, "added");
        /*@SuppressWarnings("unchecked")
		Map<String,String> uploadImage = 
		(Map<String, String>) this.fileService.fileUpload(file).getData();
		homework.setUrl(uploadImage.get("url"));
		this.homeworkDao.save(homework);
		return new SuccessResult(" added");
		///return add(imageCV);*/
		
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
		
		//updatedHomework.setUrl(entity.getUrl());
		
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

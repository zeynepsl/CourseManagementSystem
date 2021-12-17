package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.LessonService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.LessonDao;
import project.courseManagementSystem.entities.concretes.Lesson;

@Service
public class LessonManager implements LessonService{

	private LessonDao lessonDao;
	
	@Autowired
	public LessonManager(LessonDao lessonDao) {
		super();
		this.lessonDao = lessonDao;
	}
	
	@Override
	public Result add(Lesson entity) {
		try {
			lessonDao.save(entity);
			return new SuccessResult("lesson added");
		} catch (Exception e) {
			return new ErrorResult(e.getMessage());
		}
		
	}

	@Override
	public Result delete(int id) {
		lessonDao.deleteById(id);
		return new SuccessResult("lesson deleted");
	}

	@Override
	public Result update(Lesson entity) {
		lessonDao.save(entity);
		return new SuccessResult("lesson updated");
	}

	@Override
	public DataResult<Lesson> getById(int id) {
		Lesson lesson = lessonDao.findById(id);
		if(lesson == null) {
			return new ErrorDataResult<Lesson>(null, "not exist");
		}
		return new SuccessDataResult<Lesson>(lesson, "lesson viewed");
		
	}

	@Override
	public DataResult<List<Lesson>> getAll() {
		try {
			return new SuccessDataResult<List<Lesson>>(lessonDao.findAll(), "lesson listed");
		} catch (Exception e) {
			return new ErrorDataResult<List<Lesson>>(null, e.getLocalizedMessage());
		}
		
	}
	
}

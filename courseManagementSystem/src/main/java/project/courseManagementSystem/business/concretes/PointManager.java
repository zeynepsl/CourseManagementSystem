package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.HomeworkService;
import project.courseManagementSystem.business.abstracts.PointService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.PointDao;
import project.courseManagementSystem.entities.concretes.Homework;
import project.courseManagementSystem.entities.concretes.Point;
import project.courseManagementSystem.entities.dtos.PointDto;

@Service
public class PointManager implements PointService{

	private PointDao pointDao;
	private HomeworkService homeworkService;
	
	@Autowired
	public PointManager(PointDao pointDao, HomeworkService homeworkService) {
		super();
		this.pointDao = pointDao;
		this.homeworkService = homeworkService;
	}
	
	@Override
	public Result save(PointDto pointDto) {
		Point point = new Point();
		point.setComment(pointDto.getComment());
		point.setSuccessGrade(pointDto.getSuccessGrade());
		Homework homework = homeworkService.getById(pointDto.getHomeworkId()).getData();
		point.setHomework(homework);
		pointDao.save(point);
		return new SuccessResult("added");
	}

	@Override
	public Result add(Point entity) {
		return null;
	}

	@Override
	public Result delete(int id) {
		Point deletedPoint = getById(id).getData();
		if(deletedPoint == null) {
			return new ErrorResult("point is not exist");
		}
		return new SuccessResult("point deleted");
	}

	@Override
	public Result update(Point entity) {
		pointDao.save(entity);
		return new SuccessResult("updated");
	}

	@Override
	public DataResult<Point> getById(int id) {
		Point point = pointDao.findById(id);
		if(point == null) {
			return new ErrorDataResult<Point>(null, "point is not exist");
		}
		return new SuccessDataResult<Point>(point, "point viewed");
	}

	@Override
	public DataResult<List<Point>> getAll() {
		return new SuccessDataResult<List<Point>>(pointDao.findAll(), "points listed");
	}

}

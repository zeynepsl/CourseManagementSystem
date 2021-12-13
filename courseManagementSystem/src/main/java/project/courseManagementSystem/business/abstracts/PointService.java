package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Point;
import project.courseManagementSystem.entities.dtos.PointDto;

public interface PointService extends BaseService<Point>{
	public Result save(PointDto pointDto);
}

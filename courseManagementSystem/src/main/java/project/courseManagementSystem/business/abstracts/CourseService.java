package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.dtos.CourseInfoDto;

public interface CourseService extends BaseService<Course>{
	public Result addCourseWithAllInfo(CourseInfoDto courseInfoDto);
	public DataResult<CourseInfoDto> getAllInfo(int courseId);
}

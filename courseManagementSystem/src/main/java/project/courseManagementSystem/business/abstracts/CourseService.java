package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Course;

public interface CourseService extends BaseService<Course>{
	//public Result addCourseWithAllInfo(CourseInfoDto courseInfoDto);
	//public DataResult<CourseInfoDto> getAllInfo(int courseId);
	public Result addInstructorToCourse(int instructorId, int courseId);
}

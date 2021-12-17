package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.dtos.CourseDto;

public interface CourseService extends BaseService<Course>{
	//public Result addCourseWithAllInfo(CourseInfoDto courseInfoDto);
	//public DataResult<CourseInfoDto> getAllInfo(int courseId);
	public Result save(CourseDto courseDto);
	public Result addInstructorToCourse(int instructorId, int courseId);
	public Result addLessonToCourse(int lessonId, int courseId);
}

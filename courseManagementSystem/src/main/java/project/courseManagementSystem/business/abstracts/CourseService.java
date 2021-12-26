package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.dtos.CourseDto;

public interface CourseService extends BaseService<Course>{
	public Result save(CourseDto courseDto);
	public Result addInstructorToCourse(int instructorId, int courseId);
	public Result addLessonToCourse(int lessonId, int courseId);
	public DataResult<List<Course>> findByName(String name);
}

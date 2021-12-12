package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

public interface InstructorService extends BaseService<Instructor>{
	public Result addInstructorToCourse(int instructorId, int courseId);
	public DataResult<CoursesWithInstructorDto> getAllCoursesByInstructorId(int instructorId);
}

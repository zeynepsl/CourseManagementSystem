package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Instructor;

public interface InstructorService extends BaseService<Instructor>{
	public Result register(Instructor instructor);
	public Result addInstructorToCourse(int instructorId, int courseId);
}

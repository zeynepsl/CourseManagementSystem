package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.CourseRating;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

public interface CourseRatingservice{
	public DataResult<List<CourseRating>>  getAllByCourse_Id(int courseId);
	public Result addInstructorToCourse(int instructorId, int courseId);
	public DataResult<List<CoursesWithInstructorDto>> fetchDataInnerJoin();
}

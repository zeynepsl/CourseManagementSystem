package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.utilities.results.Result;

public interface CourseRatingservice{
	public Result addInstructorToCourse(int instructorId, int courseId);
}

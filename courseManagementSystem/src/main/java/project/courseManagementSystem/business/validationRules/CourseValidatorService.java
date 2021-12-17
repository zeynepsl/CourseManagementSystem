package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.dtos.CourseDto;

public interface CourseValidatorService {
	public boolean checkIfCourseInfoIsFull(CourseDto course);
}

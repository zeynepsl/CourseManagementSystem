package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.concretes.Course;

public interface CourseValidatorService {
	public boolean checkIfCourseInfoIsFull(Course course);
}

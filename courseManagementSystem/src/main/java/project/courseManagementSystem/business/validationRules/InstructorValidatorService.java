package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.concretes.Instructor;

public interface InstructorValidatorService{
	public boolean checkIfInstructorInfoIsFull(Instructor instructor);
}

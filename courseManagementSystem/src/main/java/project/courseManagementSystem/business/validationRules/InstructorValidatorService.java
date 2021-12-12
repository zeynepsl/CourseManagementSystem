package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.dtos.InstructorDto;

public interface InstructorValidatorService{
	public boolean checkIfInstructorInfoIsFull(InstructorDto instructor);
}

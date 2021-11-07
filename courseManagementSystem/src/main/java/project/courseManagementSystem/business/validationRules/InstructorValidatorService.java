package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Instructor;

public interface InstructorValidatorService{
	public Result checkIfInstructorInfoIsFull(Instructor instructor);
}

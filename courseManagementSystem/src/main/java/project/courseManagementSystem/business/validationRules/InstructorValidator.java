package project.courseManagementSystem.business.validationRules;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.entities.concretes.Instructor;

@Component
public class InstructorValidator extends UserValidator implements InstructorValidatorService{
	
	@SuppressWarnings("null")
	public Result checkIfInstructorInfoIsFull(Instructor instructor) {
		String deparmentName = instructor.getDepartmentName();
		
		if(super.checkIfUserInfoIsFull(instructor) == false 
				&& deparmentName == null && deparmentName.isBlank()) {
			return new ErrorResult("Instructor info is invalid!");
		}
		
		return new SuccessResult("Instructor info is valid!");
	}
	
}

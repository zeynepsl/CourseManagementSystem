package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.entities.concretes.Instructor;

public class InstructorValidator extends UserValidator{
	
	@SuppressWarnings("null")
	public Result checkIfInstructorInfoIsFull(Instructor instructor) {
		String deparmentName = instructor.getDepartmentName();
		
		if(super.checkIfUserInfoIsFull(instructor).isSuccess() == false 
				&& deparmentName == null && deparmentName.isBlank()) {
			return new ErrorResult("Instructor info is invalid!");
		}
		
		return new SuccessResult("Instructor info is valid!");
	}
	
}

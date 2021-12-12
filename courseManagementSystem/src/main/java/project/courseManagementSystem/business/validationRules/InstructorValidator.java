package project.courseManagementSystem.business.validationRules;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.entities.dtos.InstructorDto;

@Component
public class InstructorValidator extends UserValidator implements InstructorValidatorService{
	
	public boolean checkIfInstructorInfoIsFull(InstructorDto instructor) {
		String deparmentName = instructor.getDepartmentName();
		
		if(!super.checkIfUserInfoIsFull(instructor) 
				|| deparmentName == null || deparmentName.isBlank()) {
			return false;
		}
		
		return true;
	}
	
}

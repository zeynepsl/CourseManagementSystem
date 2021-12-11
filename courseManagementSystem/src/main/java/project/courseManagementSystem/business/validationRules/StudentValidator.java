package project.courseManagementSystem.business.validationRules;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.entities.dtos.StudentDto;

@Component
public class StudentValidator extends UserValidator implements StudentValidatorService{
	
	@Override
	public boolean checkIfStudentInfoIsFull(StudentDto student) {
		String gender = student.getGender();
		String schoolName = student.getSchoolName();
		
		if(!super.checkIfUserInfoIsFull(student) 
				|| gender == null || gender.isBlank() 
				|| schoolName == null || schoolName.isBlank()) {
			return false;
		}
		return true;
	}
		
	/*
	 	 
 StringUtils.isBlank(null)      = true
 StringUtils.isBlank("")        = true  
 StringUtils.isBlank(" ")       = true  
 StringUtils.isBlank("bob")     = false  
 StringUtils.isBlank("  bob  ") = false
 
	 */
	
}

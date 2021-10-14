package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.entities.concretes.Student;

public class StudentValidator extends UserValidator{
	
	@SuppressWarnings("null")
	public Result checkIfStudentInfoIsFull(Student student) {
		String gender = student.getGender();
		String schoolName = student.getSchoolName();
		String birthDate = student.getBirthDate().toString();
		
		if(super.checkIfUserInfoIsFull(student).isSuccess() == false 
				&& gender == null && gender.isBlank()
				&& schoolName == null && schoolName.isBlank()
				&& birthDate == null && birthDate.isBlank()) {
			return new ErrorResult("student info is invalid!");
		}
		return new SuccessResult("student info is valid!");
	}
}

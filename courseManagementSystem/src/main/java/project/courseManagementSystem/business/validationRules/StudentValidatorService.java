package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.dtos.StudentDto;

public interface StudentValidatorService {
	public boolean checkIfStudentInfoIsFull(StudentDto studentDto);
}

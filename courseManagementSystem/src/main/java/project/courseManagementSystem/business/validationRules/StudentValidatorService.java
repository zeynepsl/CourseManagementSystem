package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.concretes.Student;

public interface StudentValidatorService {
	public boolean checkIfStudentInfoIsFull(Student student);
}

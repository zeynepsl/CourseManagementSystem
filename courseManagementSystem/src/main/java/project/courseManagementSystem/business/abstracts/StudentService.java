package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.entities.concretes.Student;

public interface StudentService {
	List<Student> getAll();
}

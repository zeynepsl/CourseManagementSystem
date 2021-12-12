package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	Student findById(int id);
	List<Student> getAllByCourse_Id(int courseId);
	Student findByEmail(String email);
}

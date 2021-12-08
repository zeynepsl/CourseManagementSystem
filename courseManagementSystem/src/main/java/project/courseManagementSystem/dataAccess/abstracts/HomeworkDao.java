package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.courseManagementSystem.entities.concretes.Homework;

public interface HomeworkDao extends JpaRepository<Homework, Integer>{
	Homework findById(int homeworkId);
}

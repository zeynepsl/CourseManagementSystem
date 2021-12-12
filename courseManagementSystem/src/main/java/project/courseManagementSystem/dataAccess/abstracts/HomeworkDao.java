package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Homework;

@Repository
public interface HomeworkDao extends JpaRepository<Homework, Integer>{
	Homework findById(int homeworkId);
}

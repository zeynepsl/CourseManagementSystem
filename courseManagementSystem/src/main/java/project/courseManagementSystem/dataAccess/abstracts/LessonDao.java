package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Lesson;

public interface LessonDao extends JpaRepository<Lesson, Integer>{
	Lesson findById(int id);
}

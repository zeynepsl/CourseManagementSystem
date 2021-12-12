package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Lesson;

@Repository
public interface LessonDao extends JpaRepository<Lesson, Integer>{
	Lesson findById(int id);
}

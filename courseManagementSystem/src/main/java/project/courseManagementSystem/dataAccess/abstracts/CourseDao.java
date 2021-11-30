package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
	Course findById(int id);
}

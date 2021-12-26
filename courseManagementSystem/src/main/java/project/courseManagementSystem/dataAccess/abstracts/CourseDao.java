package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Course;

@Qualifier("courses")
@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{
	Course findById(int id);	
	List<Course> findByName(String name);
	 
}

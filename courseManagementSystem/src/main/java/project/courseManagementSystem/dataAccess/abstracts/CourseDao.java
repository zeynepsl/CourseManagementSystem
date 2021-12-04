package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.courseManagementSystem.entities.concretes.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
	Course findById(int id);
	
	@Query("from Course where name=:courseName")
	List<Course> findByName(String courseName);
	
	List<Course> findByNameOrderByIdDesc(String courseName);
	
	/*	@Query("select new project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto"
			+ "(c.name, c.startdate)"
			+ "from Instructor ns"
			+ "inner join Course c")*/
	

	
	//@Query("From Course where instructor.userId=:instructorId")
	//List<CoursesWithInstructorDto> getAllCoursesOfınstructors(int instructorId);

	//Bir instructor id al
	//o instructora ait tüm kursları listele
	
	
	/*	@Query("select "c.name, c.startDate"
	+ "from Course c"
	+ "inner join Instructor i on c.Id = ns.")*/
	

	
}

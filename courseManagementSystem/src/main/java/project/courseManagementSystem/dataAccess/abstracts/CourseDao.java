package project.courseManagementSystem.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
	Course findById(int id);
	
	//@Query("from Course where name=:courseName")
	//List<Course> findByName(String courseName);
	
	//List<Course> findByNameOrderByIdDesc(String courseName);
	
	//Bir kursa ait eğitmenleri göster
	
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

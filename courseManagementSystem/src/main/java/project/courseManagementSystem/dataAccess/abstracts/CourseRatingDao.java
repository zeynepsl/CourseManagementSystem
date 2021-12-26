package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.CourseInstructor;

public interface CourseRatingDao extends JpaRepository<CourseInstructor, Integer>{
		
	//çalışıyor:
	/*	@Query("SELECT new project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto(r.instructor) "
			+ "FROM Course c INNER JOIN c.ratings r")
	List<CoursesWithInstructorDto> fetchDataInnerJoin();*/

	//Kurslara atanmış öğretmenelri gösterir
	
}

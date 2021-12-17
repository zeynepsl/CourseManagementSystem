package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.courseManagementSystem.entities.concretes.CourseRating;
import project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto;

public interface CourseRatingDao extends JpaRepository<CourseRating, Integer>{
	
	//şu anlık hatalı:
	/*	@Query(value = "SELECT * FROM course_rating cr"
			+ "INNER JOIN courses c ON c.course_id = cr.course_id"
			+ "WHERE cr.instructor_id = ?1",
			nativeQuery = true)
	List<CourseRating> getAllByCourse_Id(int instructorId);*/

	
	
	//çalışıyor:
	/*	@Query("SELECT new project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto(r.instructor) "
			+ "FROM Course c INNER JOIN c.ratings r")
	List<CoursesWithInstructorDto> fetchDataInnerJoin();*/

	//Kurslara atanmış öğretmenelri gösterir
	
	/*
	@Query("SELECT new project.courseManagementSystem.entities.dtos.CoursesWithInstructorDto(r.instructor) "
			+ "FROM Instructor c INNER JOIN c.ratings r"
			+ "WHERE c.userId=:instructorId")
	List<CoursesWithInstructorDto> birOgrtyeAitKurslar(int instructorId);*/
	
	//select u from Group g inner join g.users u where u.user_name = :userName
	// "SELECT DISTINCT e FROM Employee e INNER JOIN e.tasks t where t.supervisor='Denise'");
	//"SELECT DISTINCT e FROM Employee e INNER JOIN e.tasks t where t.supervisor = e.name");
	//@Query("select new com.demo.entities.ProductJoin(p.id, p.name, p.price, p.category.id, p.category.name) from Product p, Category c where p.category = c")
	
	//@Query("SELECT u FROM User u JOIN u.roles r WHERE r.name LIKE %?1%")
	//@Query("SELECT DISTINCT o FROM Order o JOIN o.orderDetails od JOIN od.product p WHERE p.name LIKE %?1%")

	

}

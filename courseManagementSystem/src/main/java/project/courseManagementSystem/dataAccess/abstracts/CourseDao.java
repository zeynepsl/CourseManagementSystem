package project.courseManagementSystem.dataAccess.abstracts;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Course;

@Qualifier("courses")
@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{
	Course findById(int id);
	
	//@Query("SELECT DISTINCT c FROM Course c JOIN c.ratings r JOIN r.instructor n")
	//List<Course> getAllByInstructorId(int instructorId);
	
	/*@Query("SELECT DISTINCT o FROM Order o JOIN o.orderDetails od JOIN od.product p"
            + " WHERE p.name LIKE %?1%")
    public Page<Order> findAll(String keyword, Pageable pageable);  */
	 
}

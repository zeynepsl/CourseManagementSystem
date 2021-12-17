package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Course;
import project.courseManagementSystem.entities.concretes.Instructor;

@Qualifier("instructors")
@Repository
public interface InstructorDao extends JpaRepository<Instructor, Integer>{
	Instructor findById(int id);
	
	//@Query("SELECT DISTINCT n FROM Instructor n JOIN n.ratings r JOIN r.course c")
	//List<Instructor> getAllByInstructorId(int coId);
	
	
}

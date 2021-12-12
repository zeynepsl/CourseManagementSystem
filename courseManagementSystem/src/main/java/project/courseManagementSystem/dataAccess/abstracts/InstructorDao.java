package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.entities.concretes.Instructor;

@Qualifier("instructors")
@Repository
public interface InstructorDao extends JpaRepository<Instructor, Integer>{
	Instructor findById(int id);
}

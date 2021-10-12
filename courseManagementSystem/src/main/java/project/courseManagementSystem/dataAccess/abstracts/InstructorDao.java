package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Instructor;

public interface InstructorDao extends JpaRepository<Instructor, Integer>{

}

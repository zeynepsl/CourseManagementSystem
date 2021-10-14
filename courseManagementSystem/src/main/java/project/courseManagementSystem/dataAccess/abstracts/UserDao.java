package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	//CRUD operations are ready for User Class.
	boolean existsByEmail(String email);
}

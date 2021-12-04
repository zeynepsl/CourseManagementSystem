package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.courseManagementSystem.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	//CRUD operations are ready for User Class.
	boolean existsByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);
	//eposta sutunu bemzersizdir.  (aynı e-postaya sahip iki kullanıcı yoktur).
}

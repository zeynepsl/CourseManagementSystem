package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.courseManagementSystem.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	boolean existsByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);
	//e-posta sutunu benzersizdir.  (aynı e-postaya sahip iki kullanıcı yoktur).
	
	Optional<User> findByLastNameOrEmail(String lastName, String email);
	List<User> findByLastName(String lastName);
	
	Boolean existsByLastName(String lastName);	
	
	List<User> findByUsernameOrEmail(String username, String email);
	List<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
}

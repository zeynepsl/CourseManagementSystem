package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.courseManagementSystem.core.entities.Role;

import java.util.List;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer>{
	List<Role> findByName(String name);
}

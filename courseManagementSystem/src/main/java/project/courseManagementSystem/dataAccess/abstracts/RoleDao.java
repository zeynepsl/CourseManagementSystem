package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.core.entities.Role;

import java.util.List;

public interface RoleDao extends JpaRepository<Role, Integer>{
	List<Role> findByName(String name);
}

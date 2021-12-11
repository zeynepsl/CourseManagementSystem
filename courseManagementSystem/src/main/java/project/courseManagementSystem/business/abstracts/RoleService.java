package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.utilities.results.DataResult;

public interface RoleService extends BaseService<Role>{
	public DataResult<List<Role>> findByName(String roleName);
}

package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;

public interface UserService extends BaseService<User>{
	public boolean existsByEmail(String email);
	public boolean existByUsername(String username);
	public boolean existById(int id);
	public DataResult<User> findByEmail(String email);
	public Result addRoleToUser(int roleId, int userId);
}

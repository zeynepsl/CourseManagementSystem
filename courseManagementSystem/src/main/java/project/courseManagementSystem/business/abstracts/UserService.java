package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.entities.concretes.User;

public interface UserService extends BaseService<User>{
	public boolean existsByEmail(String email);
	public boolean existById(int id);
	public DataResult<User> findByEmail(String email);
}

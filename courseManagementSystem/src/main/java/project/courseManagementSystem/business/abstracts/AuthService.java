package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.entities.dtos.LoginDto;

public interface AuthService {
	public DataResult<User> login(LoginDto loginDto);
}

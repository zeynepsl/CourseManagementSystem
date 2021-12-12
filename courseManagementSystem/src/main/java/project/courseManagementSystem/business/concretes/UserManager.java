package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.RoleService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.UserDao;

@Service
public class UserManager implements UserService{

	//you need to access to dataAccess layer. So:
	private UserDao userDao; 
	private RoleService roleService;

	@Autowired
	public UserManager(UserDao userDao, RoleService roleService) {
		super();
		this.userDao = userDao;
		this.roleService = roleService;
	}
	
	@Override
	public Result add(User entity) {
		userDao.save(entity);
		return new SuccessResult("User added!");
	}
	@Override
	public Result delete(int id) {
		userDao.deleteById(id);
		return new SuccessResult("User deleted!");
	}
	@Override
	public Result update(User entity) {
		userDao.save(entity);
		return new SuccessResult("User updated!");
	}
	@Override
	public DataResult<User> getById(int id) {
		User user = userDao.findById(id).get();
		if(user == null) {
			return new ErrorDataResult<User>(null, "user is not exist");
		}
		return new SuccessDataResult<User>(user, "User viewed!");
	}
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Users listed!");
	}

	@Override
	public boolean existsByEmail(String email) {
		boolean result = userDao.existsByEmail(email);
		if(result) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean existById(int id) {
		boolean result = userDao.existsById(id);
		if(result) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean existByUsername(String username) {
		boolean result = userDao.existsByUsername(username);
		if(result) {
			return true;
		}
		return false;
	}
	
	@Override
	public DataResult<User> findByEmail(String email) {
		User user = userDao.findByEmail(email);
		if(user == null) {
			return new ErrorDataResult<User>(null, "user is not exist");
		}
		return new SuccessDataResult<User>(user, "user listed");	
	}

	@Override
	public Result addRoleToUser(int roleId, int userId) {
		Role role = roleService.getById(roleId).getData();
		User user = getById(userId).getData();
		user.getRoles().add(role);
		userDao.save(user);
		return new SuccessResult("rol, ilgili user a atandı");
	}

}

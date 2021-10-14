package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.UserDao;
import project.courseManagementSystem.entities.concretes.User;

@Service
public class UserManager implements UserService{

	//you need to access to dataAccess layer. So:
	private UserDao userDao; 

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public Result add(User entity) {
		userDao.save(entity);
		return new SuccessResult("User added!");
	}
	@Override
	public Result delete(User entity) {
		userDao.delete(entity);
		return new SuccessResult("User deleted!");
	}
	@Override
	public Result update(User entity) {
		userDao.save(entity);
		return new SuccessResult("User updated!");
	}
	@Override
	public DataResult<User> getById(int id) {
		return new SuccessDataResult<User>(userDao.getById(id), "User viewed!");
	}
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Users listed!");
	}

	@Override
	public Result existsByEmail(String email) {
		boolean result = userDao.existsByEmail(email);
		if(result) {
			return new ErrorResult("this email already exists!");
		}
		return new SuccessResult();
	}

}

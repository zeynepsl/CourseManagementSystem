package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.RoleService;
import project.courseManagementSystem.business.constants.Messages;
import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.RoleDao;

@Service
public class RoleManager implements RoleService{

	private RoleDao roleDao;
	
	@Autowired
	public RoleManager(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	@Override
	public Result add(Role entity) {
		roleDao.save(entity);
		return new SuccessResult(Messages.added);
	}

	@Override
	public Result delete(int id) {
		if(getById(id).getData() == null) {
			return new ErrorResult(Messages.isNotExist);
		}
		roleDao.deleteById(id);
		return new SuccessResult(Messages.deleted);
	}

	@Override
	public Result update(Role entity) {
		roleDao.save(entity);
		return new SuccessResult(Messages.updated);
	}

	@Override
	public DataResult<Role> getById(int id) {
		Role role = roleDao.findById(id).get();
		if(role == null) {
			return new ErrorDataResult<Role>(null, Messages.isNotExist);
		}
		return new SuccessDataResult<Role>(role, Messages.viewed);
	}

	@Override
	public DataResult<List<Role>> getAll() {
		return new SuccessDataResult<List<Role>>(roleDao.findAll(), Messages.listed);
	}

	@Override
	public DataResult<List<Role>> findByName(String roleName) {
		return new SuccessDataResult<List<Role>>(roleDao.findByName(roleName), Messages.listed);
	}

}

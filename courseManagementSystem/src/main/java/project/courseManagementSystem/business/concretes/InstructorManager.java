package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.InstructorDao;
import project.courseManagementSystem.entities.concretes.Instructor;

@Service
public class InstructorManager implements InstructorService{

	private InstructorDao instructorDao;
	private UserService userService;
	
	@Autowired
	public InstructorManager(InstructorDao instructorDao, UserService userService) {
		this.instructorDao = instructorDao;
		this.userService = userService;	
	}
	
	@Override
	public Result add(Instructor entity) {
		instructorDao.save(entity);
		return new SuccessResult("Instructor added!");
	}

	@Override
	public Result delete(int id) {
		try {
			if(userService.existById(id)) {
			instructorDao.deleteById(id);
			return new SuccessResult("Instructor deleted!");
		}
		
		return new ErrorResult("instructor is not exist");	
		} catch (Exception e) {
			return new ErrorResult(e.getLocalizedMessage());
		}
		
	}

	@Override
	public Result update(Instructor entity) {
		Instructor updatedUser = getById(entity.getId()).getData();
		
		updatedUser.setFirstName(entity.getFirstName());
		updatedUser.setLastName(entity.getLastName());
		updatedUser.setEmail(entity.getEmail());
		updatedUser.setDepartmentName(entity.getDepartmentName());
		updatedUser.setPhoneNumber(entity.getPhoneNumber());
		updatedUser.setNationalityId(entity.getNationalityId());
		
		instructorDao.save(updatedUser);
		return new SuccessResult("Instructor updated!");
	}

	@Override
	public DataResult<Instructor> getById(int id) {
		Instructor instructor = instructorDao.findById(id);
		if(instructor == null) {
			return new ErrorDataResult<Instructor>(null, "Instructor is not exist");
		}
		return new SuccessDataResult<Instructor>(instructorDao.findById(id), "Instructor viewed!");
	}

	@Override
	public DataResult<List<Instructor>> getAll() {
		return new SuccessDataResult<List<Instructor>>(instructorDao.findAll(), "Instructors listed");
	}
	
	
	public DataResult<List<Instructor>> birKurstakiEgitmenler(int courseId){
		//Course course = courseService.getById(courseId).getData();
		//course
		return null;
	}

}

package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.InstructorService;
import project.courseManagementSystem.dataAccess.abstracts.InstructorDao;
import project.courseManagementSystem.entities.concretes.Instructor;

@Service
public class InstructorManager implements InstructorService{

	private InstructorDao instructorDao;
	
	@Autowired
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}

	@Override
	public List<Instructor> getAll() {
		return instructorDao.findAll();
	}

}

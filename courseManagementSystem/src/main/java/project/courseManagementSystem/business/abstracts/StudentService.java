package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Student;

public interface StudentService extends BaseService<Student>{
	public Result register(Student student);
	public DataResult<Student> findByEmail(String email);
}

package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.entities.concretes.Student;

public interface StudentService extends BaseService<Student>{
	public DataResult<Student> getByEmail(String email);
	public DataResult<List<Student>> getAllByCourse_Id(int courseId);
}

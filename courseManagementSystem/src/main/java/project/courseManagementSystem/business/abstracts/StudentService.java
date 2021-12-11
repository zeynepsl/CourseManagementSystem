package project.courseManagementSystem.business.abstracts;

import java.util.List;

import project.courseManagementSystem.core.business.BaseService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Student;
import project.courseManagementSystem.entities.dtos.StudentDto;

public interface StudentService extends BaseService<Student>{
	public Result register(StudentDto studentDto);
	public DataResult<Student> getByEmail(String email);
	public DataResult<List<Student>> getAllByCourse_Id(int courseId);
}

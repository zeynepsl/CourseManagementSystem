package project.courseManagementSystem.business.abstracts;

import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.dtos.InstructorDto;
import project.courseManagementSystem.entities.dtos.LoginDto;
import project.courseManagementSystem.entities.dtos.StudentDto;

public interface AuthService {
	public DataResult<User> login(LoginDto loginDto);
	public Result registerForStudent(StudentDto studentDto);
	public Result registerForInstructor(InstructorDto instructorDto);
}

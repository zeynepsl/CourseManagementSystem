package project.courseManagementSystem.entities.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.entities.concretes.Course;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesWithInstructorDto {
	//private String lastName;
	private String email;
	private List<Course> courses;
}

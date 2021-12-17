package project.courseManagementSystem.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.entities.concretes.Instructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesWithInstructorDto {
	private Instructor instructor;
}

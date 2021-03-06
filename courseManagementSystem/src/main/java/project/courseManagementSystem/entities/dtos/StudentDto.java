package project.courseManagementSystem.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.core.entities.User;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto extends User{
	private String schoolName;
	private String gender;
	private int courseId;
}

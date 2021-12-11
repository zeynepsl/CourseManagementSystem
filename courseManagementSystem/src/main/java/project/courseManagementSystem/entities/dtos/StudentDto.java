package project.courseManagementSystem.entities.dtos;

import java.time.LocalDate;

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
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String phoneNumber;
	private String nationalityId;
	private LocalDate birthDate;
	private String password;
	
	private String schoolName;
	private String gender;
	private int courseId;
}

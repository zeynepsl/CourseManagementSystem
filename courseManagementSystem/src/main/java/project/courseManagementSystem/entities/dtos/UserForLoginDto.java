package project.courseManagementSystem.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.core.entities.Dto;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserForLoginDto implements Dto{
	private String password;
	
	
	private String email;
}

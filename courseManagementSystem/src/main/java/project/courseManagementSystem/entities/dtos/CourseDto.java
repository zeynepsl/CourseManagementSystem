package project.courseManagementSystem.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseDto {
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<Integer> studentIds;
	
}

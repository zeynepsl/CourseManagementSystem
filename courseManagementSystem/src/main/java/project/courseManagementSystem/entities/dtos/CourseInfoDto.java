package project.courseManagementSystem.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.entities.concretes.Instructor;
import project.courseManagementSystem.entities.concretes.Lesson;
import project.courseManagementSystem.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseInfoDto {
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<Instructor> instructors;
	private List<Lesson> lessons;
	private List<Student> students;
	
	/*	private List<Integer> instructorIds;
	private List<Integer> lessonIds;
	private List<Integer> studentIds;*/
	
}

package project.courseManagementSystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrolledInstructor {
	private int courses_course_id;
	private int enrolled_instructors_user_id;
}

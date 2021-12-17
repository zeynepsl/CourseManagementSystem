package project.courseManagementSystem.business.validationRules;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.entities.dtos.CourseDto;

@Component
public class CourseValidator implements CourseValidatorService{

	@Override
	public boolean checkIfCourseInfoIsFull(CourseDto course) {
		String name =  course.getName();
		String startDate = course.getStartDate().toString();
		String endDate = course.getEndDate().toString();
		
		if(name.isBlank() || 
				startDate == null || startDate.isBlank() || 
				endDate.isBlank()) {
			return false;
		}
		return true;
	}

}

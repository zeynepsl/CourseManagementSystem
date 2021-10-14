package project.courseManagementSystem.business.validationRules;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.entities.concretes.User;

@Component
public class UserValidator {
	
	@SuppressWarnings("null")
	public Result checkIfUserInfoIsFull(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String email = user.getEmail();
		String phoneNumber = user.getPhoneNumber();
		String nationalityId = user.getNationalityId();

		if(firstName == null && firstName.isBlank()
				&& lastName == null && lastName.isBlank()
				&& email == null && email.isBlank()
				&& phoneNumber == null && phoneNumber.isBlank()
				&& nationalityId == null && nationalityId.isBlank()) {
			return new ErrorResult("user information is invalid!");
		}
		return new SuccessResult("user information is valid!");
	}
	
}

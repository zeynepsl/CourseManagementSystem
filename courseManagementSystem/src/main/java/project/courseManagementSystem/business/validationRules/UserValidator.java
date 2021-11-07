package project.courseManagementSystem.business.validationRules;

import project.courseManagementSystem.entities.concretes.User;

public abstract class UserValidator {

	public boolean checkIfUserInfoIsFull(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String email = user.getEmail();
		String phoneNumber = user.getPhoneNumber();
		String nationalityId = user.getNationalityId();
		String birthDate = user.getBirthDate().toString();

		if(firstName == null || firstName.isBlank() 
				|| lastName ==null || lastName.isBlank() 
				|| email ==null || email.isBlank() 
				|| phoneNumber ==null || phoneNumber.isBlank() 
				|| nationalityId == null || nationalityId.isBlank() || nationalityId.length() != 11
				|| birthDate == null || birthDate.isBlank()) {
			return false;
		}
		return true;
	}
}

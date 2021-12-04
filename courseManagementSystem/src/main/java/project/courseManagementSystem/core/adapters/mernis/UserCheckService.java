package project.courseManagementSystem.core.adapters.mernis;

import org.springframework.stereotype.Service;

import project.courseManagementSystem.core.entities.User;

@Service
public interface UserCheckService {
	public boolean checkIfRealPerson(User user);
}

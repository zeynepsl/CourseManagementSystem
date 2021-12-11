package project.courseManagementSystem.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.AuthService;
import project.courseManagementSystem.business.abstracts.UserService;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.entities.dtos.LoginDto;

@Service
public class AuthManager implements AuthService{
	
	private UserService userService;
	private AuthenticationManager authenticationManager;

	@Autowired
	public AuthManager(UserService userService, AuthenticationManager authenticationManager) {
		super();
		this.userService = userService;
		this.authenticationManager = authenticationManager;
	}

	@Override
	public DataResult<User> login(LoginDto loginDto) {
		User userToCheck = userService.findByEmail(loginDto.getEmail()).getData();
		if(userToCheck == null) {
			return new ErrorDataResult<User>(null, "user not found");
		}
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new SuccessDataResult<User>(userToCheck, "User login successfully");
	}
	
}

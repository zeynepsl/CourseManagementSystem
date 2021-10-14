package project.courseManagementSystem.core.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessResult;

@Service
//!!!!!!!!!!!!?????????????

public class EmailCheckManager implements EmailCheckService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	/*	public static boolean validate(String email) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		        return matcher.find();
		}*/

	@Override
	public Result emailCheck(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		if(matcher.find()) {
			return new SuccessResult("email is valid!");
		}
		return new ErrorResult("email is not valid!");
	}

}
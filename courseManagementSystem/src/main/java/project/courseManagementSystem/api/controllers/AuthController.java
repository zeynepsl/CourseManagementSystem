package project.courseManagementSystem.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.courseManagementSystem.business.abstracts.AuthService;
import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.dataAccess.abstracts.RoleDao;
import project.courseManagementSystem.dataAccess.abstracts.UserDao;
import project.courseManagementSystem.entities.dtos.LoginDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	//Login islemi icin:
	//@Autowired
    //private AuthenticationManager authenticationManager;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired 
    private AuthService authService;

    @PostMapping("/login")
    public DataResult<User> login(@RequestBody LoginDto loginDto){
    	return authService.login(loginDto);
    }
     
    //asagidaki metot deneme ogrenme amaclidir, dikkate almayin (dogru calisiyor)
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody User user){

        // add check for username exists in a DB
        if(userDao.existsByUsername(user.getUsername())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }
        

        // add check for email exists in DB
        if(userDao.existsByEmail(user.getEmail())){
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        // create user object
        User savedUser = new User();
        savedUser.setLastName(user.getLastName());
        savedUser.setUsername(user.getUsername());
        savedUser.setEmail(user.getEmail());
        savedUser.setPassword(passwordEncoder.encode(user.getPassword()));

        List<Role> roles =roleDao.findByName("ROLE_ADMIN");
       // user.setRoles(Collections.singleton(roles));
        user.setRoles(roles);

        userDao.save(savedUser);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
}

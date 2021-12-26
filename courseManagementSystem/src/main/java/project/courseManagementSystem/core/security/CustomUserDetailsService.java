package project.courseManagementSystem.core.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import project.courseManagementSystem.core.entities.Role;
import project.courseManagementSystem.core.entities.User;
import project.courseManagementSystem.dataAccess.abstracts.UserDao;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	private UserDao userDao;
	
	@Autowired
	public CustomUserDetailsService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		
		/*java guides:
		        User user = ( userDao.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)) .orElseThrow(() ->
                       new UsernameNotFoundException("User not found with username or email:" + usernameOrEmail));
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), mapRolesToAuthorities(user.getRoles()));
		 
		 */
		/*java guides rsh*/
		User user = userDao.findByEmail(usernameOrEmail);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }
	


    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(List<Role> list){
        return list.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
	
}

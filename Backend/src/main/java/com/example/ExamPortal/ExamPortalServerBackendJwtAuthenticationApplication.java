package com.example.ExamPortal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
/*import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.ExamPortal.models.Role;
import com.example.ExamPortal.models.User;
import com.example.ExamPortal.models.UserRole;
import com.example.ExamPortal.service.UserService;
/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.ExamPortal.models.Role;
import com.example.ExamPortal.models.User;
import com.example.ExamPortal.models.UserRole;
import com.example.ExamPortal.service.UserService;*/

@SpringBootApplication
public class ExamPortalServerBackendJwtAuthenticationApplication implements CommandLineRunner {
	/*@Autowired
	private UserService userService;*/
	
	public static void main(String[] args) {

		SpringApplication.run(ExamPortalServerBackendJwtAuthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("server starting...");
	
		/*BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
			
		User user=new User();
		user.setFirstName("admin");
		user.setLastName("admin");
		user.setEmail("admin@gmail.com");
		user.setUsername("admin");
		user.setPassword(passwordEncoder.encode("admin"));
		user.setPhoneNo("20996633");
		user.setProfile("default.img");
		
		Role role1=new Role();
		role1.setRoleId(10L);
		role1.setRoleName("ADMIN");
		
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user,userRoleSet);
		System.out.println(user1.getUsername());
		
		*/
	}

}

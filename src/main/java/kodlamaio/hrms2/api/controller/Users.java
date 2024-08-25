package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.core.utilities.results.DataResult;

import kodlamaio.hrms2.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class Users {
	
	private UserService userService;

	public Users(UserService userService) {
		super();
		this.userService = userService;
	}
	
	

	
	@GetMapping("/getUsers")
	public DataResult<List<User>> getUsers() {
	
		return this.userService.getUsers();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



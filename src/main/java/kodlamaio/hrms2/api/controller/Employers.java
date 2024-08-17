package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.EmployerService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.Employer;
import kodlamaio.hrms2.entities.concretes.User;

@RestController
@RequestMapping("/api/employers")
public class Employers {
	
	private EmployerService employerService;

	public Employers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getEmployers")
	public DataResult<List<Employer>> getEmployers(){
		return this.employerService.getEmployers();
		
	}
	
	@PostMapping("/addEmployer")
	public Result addUser(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	

}

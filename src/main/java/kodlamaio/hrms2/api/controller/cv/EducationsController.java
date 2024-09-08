package kodlamaio.hrms2.api.controller.cv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.cvServices.EducationService;
import kodlamaio.hrms2.core.utilities.results.DataResult;

import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.Education;


@RestController
@RequestMapping("/api/educations")
public class EducationsController {
	
	private EducationService educationService;
	
	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Education>>getAll(){
		return educationService.getAll();
		
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
    return 	this.educationService.add(education);
	
		
	}
	@GetMapping("/getAllSorted")
	public DataResult<List<Education>> getAllSorted() {
		return this.educationService.getAllSorted();
	}
	
	
	
	
	
	
	
	

}

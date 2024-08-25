package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.JobPositionService;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.JobPosition;



@RestController
@RequestMapping("/api/jobTitles")
public class JobPositions {
	
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositions(JobPositionService jobPositionService) {
		super();
		this.jobPositionService=jobPositionService;
	}


	@GetMapping("/getJobs")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getJobs();
		
	}
	
	@PostMapping("/addJob")
	public Result addUser(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}

}

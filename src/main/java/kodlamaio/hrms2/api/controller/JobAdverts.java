package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.JobAdvertService;
import kodlamaio.hrms2.core.utilities.results.DataResult;

import kodlamaio.hrms2.entities.concretes.JobAdvert;

@RestController
@RequestMapping("api/jobAdverts")
public class JobAdverts {
	
	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdverts(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@GetMapping("getAllAdverts")
	public DataResult<List<JobAdvert>>getAll(){
		
		return jobAdvertService.getAll();
	}
	
	@GetMapping("/getAdvertsSorted")
	public DataResult<List<JobAdvert>> getAllSorted(){
		return this.jobAdvertService.getAllSorted();
	}

}

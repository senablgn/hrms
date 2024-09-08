package kodlamaio.hrms2.api.controller.cv;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.cvServices.WorkExperienceService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;

import kodlamaio.hrms2.entities.concretes.cv.WorkExperience;

@RestController
@RequestMapping("/api/workExperiences")
public class WorkExperiencesController {
	
	private WorkExperienceService workExperienceService;

	public WorkExperiencesController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WorkExperience>>getAll(){
		return this.workExperienceService.getAll();
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkExperience workExperience) {
		return this.workExperienceService.add(workExperience);
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<WorkExperience>> getAllSorted() {
		return this.workExperienceService.getAllSorted();
		
	}
	
	
	
	
	

}

package kodlamaio.hrms2.api.controller.cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.cvServices.TalentService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.Talent;

@RestController
@RequestMapping("/api/talents")
public class TalentsController {
	
	private TalentService talentService;
	@Autowired
	public TalentsController(TalentService talentService) {
		super();
		this.talentService = talentService;
	}
	@GetMapping("/getAll")
	public DataResult<List<Talent>>getAll(){
		return this.talentService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Talent talent) {
		return this.talentService.add(talent);
	}

}

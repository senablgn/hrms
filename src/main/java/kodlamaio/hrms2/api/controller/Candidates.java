package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.CandidateService;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class Candidates {
	

	private CandidateService candidateService;
	@Autowired
	public Candidates(CandidateService candidateService) {
		super();
		this.candidateService =candidateService;
	}
	
	@GetMapping("/getCandidates")
	public DataResult<List<Candidate>> getEmployers(){
		return this.candidateService.getCandidates();
		
	}
	
	@PostMapping("/addCandidate")
	public Result addUser(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}


}

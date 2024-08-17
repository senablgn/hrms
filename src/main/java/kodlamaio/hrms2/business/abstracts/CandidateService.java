package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.Candidate;


public interface CandidateService {
	DataResult<List<Candidate>>getCandidates();
	Result add(Candidate candidate);
	
	
	

}

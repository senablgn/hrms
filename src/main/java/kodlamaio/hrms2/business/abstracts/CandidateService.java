package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.Candidate;
import kodlamaio.hrms2.entities.concretes.dtos.CvDto;



public interface CandidateService {
	DataResult<List<Candidate>>getCandidates();
	Result add(Candidate candidate);
	
	DataResult<List<CvDto>>getCvDtos();
	
	
	

}

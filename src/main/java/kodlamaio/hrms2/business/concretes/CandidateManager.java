package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.CandidateService;
import kodlamaio.hrms2.core.adapters.abstracts.MernisCheckService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.ErrorResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms2.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms2.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	
	private CandidateDao candidateDao;
	private MernisCheckService mernisCheckService;
	private EmailVerificationService emailVerificationService;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,MernisCheckService mernisCheckService
			,EmailVerificationService emailVerificationService) {
		super();
		this.candidateDao = candidateDao;
		this.mernisCheckService=mernisCheckService;
		this.emailVerificationService=emailVerificationService;
	}



	@Override
	public DataResult<List<Candidate>> getCandidates() {
		
		return new SuccessDataResult<List<Candidate>>("candidates listed");
				
				
	}



	@Override
	public Result add(Candidate candidate) {
		if(mernisCheckService.checkMernis(candidate)) {
			emailVerificationService.verifyEmail();
			candidateDao.save(candidate);
		return new SuccessResult("candidate added");
		
		}else {
			return new ErrorResult("Mernis check failed");
		}
		
		
		
		
	}
	
	
	
	

}

package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.EmployerService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms2.core.verifications.abstracts.HRMSVerificationService;
import kodlamaio.hrms2.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms2.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private HRMSVerificationService hrmsVerificationService;
	private EmailVerificationService emailVerificationService;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,HRMSVerificationService hrmsVerificationService
			,EmailVerificationService emailVerificationService) {
		super();
		this.employerDao = employerDao;
		this.hrmsVerificationService=hrmsVerificationService;
		this.emailVerificationService=emailVerificationService;
	}



	@Override
	public DataResult<List<Employer>> getEmployers() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "employers listed");
				
				
	}



	@Override
	public Result add(Employer employer) {
		this.hrmsVerificationService.verify();
		this.emailVerificationService.verifyEmail();
		employerDao.save(employer);
		return new SuccessResult("employer added");
	}
	
	
	
	

}

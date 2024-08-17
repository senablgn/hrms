package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.JobPositionService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.JobPositionDao;

import kodlamaio.hrms2.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}



	@Override
	
	public DataResult<List<JobPosition>> getJobs() {
		
		return new SuccessDataResult<List<JobPosition>>("jobs listed");
				
	}



	@Override
	public Result add(JobPosition jobPosition) {
		
		return new SuccessResult("job added");
	}
	
	
	
	

}

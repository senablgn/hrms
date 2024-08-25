package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.JobAdvertService;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms2.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService{
	
	private JobAdvertDao jobAdvertDao;
	
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}



	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(), "adverts listed");
	}



	@Override
	public DataResult<List<JobAdvert>> getAllSorted() {
		Sort sort=Sort.by(Direction.ASC,"applicationDeadline" );
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(sort), "listed");
	}



	@Override
	public DataResult<List<JobAdvert>> getByCityId(int cityId) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByCity_Id(cityId),
				"job adverts listed");
	}



	@Override
	public DataResult<List<JobAdvert>> getByJobPositionId(int jobPositionId) {
		
		return new SuccessDataResult<List<JobAdvert>>
		(this.jobAdvertDao.getByJobPosition_Id(jobPositionId), "job adverts listed");
	}



	@Override
	public DataResult<List<JobAdvert>> getByCityIdAndJobPositionId(int cityId, int jobPositionId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvert>>
		(this.jobAdvertDao.getByCity_IdAndJobPosition_Id(cityId, jobPositionId), "listed");
	}



	



	
	
	
	
	
	
	
	

	
	

}

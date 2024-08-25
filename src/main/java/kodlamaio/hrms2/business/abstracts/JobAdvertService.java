package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.entities.concretes.JobAdvert;

public interface JobAdvertService {
	DataResult<List<JobAdvert>>getAll();
	DataResult<List<JobAdvert>>getAllSorted();
	
	DataResult<List<JobAdvert>>getByCityId(int cityId);
	DataResult<List<JobAdvert>>getByJobPositionId(int jobPositionId);
	DataResult<List<JobAdvert>> getByCityIdAndJobPositionId(int cityId,int jobPositionId);

}

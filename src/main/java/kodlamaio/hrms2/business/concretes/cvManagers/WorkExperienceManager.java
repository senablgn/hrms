package kodlamaio.hrms2.business.concretes.cvManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.cvServices.WorkExperienceService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.cvDaos.WorkExperiencesDao;
import kodlamaio.hrms2.entities.concretes.cv.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService{
	
	private WorkExperiencesDao workExperiencesDao;

	@Autowired
	public WorkExperienceManager(WorkExperiencesDao workExperiencesDao) {
		super();
		this.workExperiencesDao = workExperiencesDao;
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		
		return new SuccessDataResult<List<WorkExperience>>(this.workExperiencesDao.findAll(), "work experiences listed");
	}

	@Override
	public Result add(WorkExperience workExperience) {
		this.workExperiencesDao.save(workExperience);
		return new SuccessResult("work experience added");
	}

	@Override
	public DataResult<List<WorkExperience>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC,"endDate");
		return new SuccessDataResult<List<WorkExperience>>(this.workExperiencesDao.findAll(sort), "sorted");
	}
	
	
	
	
	
	

}

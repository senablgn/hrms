package kodlamaio.hrms2.business.concretes.cvManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.cvServices.EducationService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.cvDaos.EducationDao;
import kodlamaio.hrms2.entities.concretes.cv.Education;
@Service
public class EducationManager implements EducationService {
	private EducationDao educationDao;
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(), "educations listed");

	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("education added");
	}

	@Override
	public DataResult<List<Education>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC,"endDate");
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(sort), "educations sorted");
	}
	
	

}

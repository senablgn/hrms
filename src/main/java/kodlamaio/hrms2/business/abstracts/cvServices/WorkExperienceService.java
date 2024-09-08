package kodlamaio.hrms2.business.abstracts.cvServices;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.WorkExperience;

public interface WorkExperienceService {
	DataResult<List<WorkExperience>>getAll();
	Result add(WorkExperience workExperience);
	DataResult<List<WorkExperience>>getAllSorted();

}

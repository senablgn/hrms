package kodlamaio.hrms2.business.abstracts.cvServices;

import java.util.List;



import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.Education;

public interface EducationService {
	DataResult<List<Education>>getAll();
    Result add(Education education);
    DataResult<List<Education>>getAllSorted();

}

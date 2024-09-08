package kodlamaio.hrms2.business.abstracts.cvServices;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.Language;

public interface LanguageService {
	DataResult<List<Language>>getAll();
	Result add(Language language);

}

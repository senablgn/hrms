package kodlamaio.hrms2.business.abstracts;

import java.util.List;



import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.City;

public interface CityService {
	DataResult<List<City>>getCities();
	Result addCities(City city);

}

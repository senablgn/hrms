package kodlamaio.hrms2.business.concretes;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.CityService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.CityDao;
import kodlamaio.hrms2.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getCities() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "cities listed");
	}

	@Override
	public Result addCities(City city) {
		this.cityDao.save(city);
		return new SuccessResult("city added");
	}

	
	
	

}

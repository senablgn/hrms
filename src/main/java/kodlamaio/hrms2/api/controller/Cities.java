package kodlamaio.hrms2.api.controller;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.CityService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class Cities {
	
	private CityService cityService;

	public Cities(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	
	@GetMapping("/getCities")
	public DataResult<List<City>>getCities(){
		return this.cityService.getCities();
	}
	
	
	@PostMapping
	public Result addCity(@RequestBody City city) {
		return this.cityService.addCities(city);
	}
	
	
	

}

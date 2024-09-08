package kodlamaio.hrms2.api.controller.cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.cvServices.WebAddressService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.entities.concretes.cv.WebAddress;

@RestController
@RequestMapping("/api/webAddresses")
public class WebAddressesController {
	
	private WebAddressService webAddressService;
	@Autowired
	public WebAddressesController(WebAddressService webAddressService) {
		super();
		this.webAddressService = webAddressService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WebAddress>> getAll() {
		return this.webAddressService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WebAddress webAddress) {
		this.webAddressService.add(webAddress);
		return new SuccessResult("web address added");
	}
	
	
	

}

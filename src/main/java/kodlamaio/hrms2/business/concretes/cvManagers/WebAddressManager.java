package kodlamaio.hrms2.business.concretes.cvManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.cvServices.WebAddressService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.cvDaos.WebAddressDao;
import kodlamaio.hrms2.entities.concretes.cv.WebAddress;

@Service
public class WebAddressManager implements WebAddressService{
	private WebAddressDao webAddressDao;

	@Autowired
	public WebAddressManager(WebAddressDao webAddressDao) {
		super();
		this.webAddressDao = webAddressDao;
	}

	@Override
	public DataResult<List<WebAddress>> getAll() {
		
		return new SuccessDataResult<List<WebAddress>>(this.webAddressDao.findAll(), "web addresses listed");
	}

	@Override
	public Result add(WebAddress webAddress) {
		this.webAddressDao.save(webAddress);
		return new SuccessResult("web address added");
	}
	
	

}

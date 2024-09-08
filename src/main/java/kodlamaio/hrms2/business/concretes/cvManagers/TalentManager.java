package kodlamaio.hrms2.business.concretes.cvManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.cvServices.TalentService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.cvDaos.TalentDao;
import kodlamaio.hrms2.entities.concretes.cv.Talent;

@Service
public class TalentManager implements TalentService{
	
	private TalentDao talentDao;

	@Autowired
	public TalentManager(TalentDao talentDao) {
		super();
		this.talentDao = talentDao;
	}

	@Override
	public DataResult<List<Talent>> getAll() {
		
		return new SuccessDataResult<List<Talent>>(this.talentDao.findAll(), "talents listed");
	}

	@Override
	public Result add(Talent talent) {
		this.talentDao.save(talent);
		return new SuccessResult("talent added");
	}
	
	
	
	

}

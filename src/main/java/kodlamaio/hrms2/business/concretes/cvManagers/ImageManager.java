package kodlamaio.hrms2.business.concretes.cvManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.cvServices.ImageService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.cvDaos.ImageDao;
import kodlamaio.hrms2.entities.concretes.cv.Image;

@Service
public class ImageManager implements ImageService{
	
	private ImageDao imageDao;
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(), "images listed");
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("image added");
	}
	
	

}

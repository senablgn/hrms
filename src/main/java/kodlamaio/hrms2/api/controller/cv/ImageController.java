package kodlamaio.hrms2.api.controller.cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.cvServices.ImageService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.cv.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	
	private ImageService imageService;
	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Image>>getAll(){
		return this.imageService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Image image) {
		return this.imageService.add(image);
		
	}

}

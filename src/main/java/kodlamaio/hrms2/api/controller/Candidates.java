package kodlamaio.hrms2.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms2.business.abstracts.CandidateService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms2.entities.concretes.Candidate;
import kodlamaio.hrms2.entities.concretes.dtos.CvDto;


@RestController
@RequestMapping("/api/candidates")
public class Candidates {

	private CandidateService candidateService;

	@Autowired
	public Candidates(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getCandidates")
	public ResponseEntity<Object> getCandidates() {
		return ResponseEntity.ok(this.candidateService.getCandidates());

	}

	@PostMapping("/addCandidate")
	public ResponseEntity<Object> addUser(@Valid @RequestBody Candidate candidate) {
		return ResponseEntity.ok(this.candidateService.add(candidate));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exception) {
		Map<String, String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());

		}

		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "validation errors");

		return errors;
	}

	
	
	
	@GetMapping("/getCvDtos")
	public DataResult<List<CvDto>> getCvDtos() {
		
		return this.candidateService.getCvDtos();
	}
	
	
	
	
	

}

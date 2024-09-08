package kodlamaio.hrms2.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import kodlamaio.hrms2.entities.concretes.cv.CoverLetter;
import kodlamaio.hrms2.entities.concretes.cv.Education;
import kodlamaio.hrms2.entities.concretes.cv.Language;
import kodlamaio.hrms2.entities.concretes.cv.Talent;
import kodlamaio.hrms2.entities.concretes.cv.WebAddress;
import kodlamaio.hrms2.entities.concretes.cv.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "candidate_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","work_experiences","languages"})
public class Candidate extends User {
	

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "identity_number")
	private String identityNumber;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Education>educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<WorkExperience>workExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Language>languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Talent>talents;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate")
	private WebAddress webAddress;
	
	@OneToMany(mappedBy = "candidate")
	private List<CoverLetter>coverLetters;
	
	
	
	
	
}

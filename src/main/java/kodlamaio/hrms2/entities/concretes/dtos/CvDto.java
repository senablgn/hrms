package kodlamaio.hrms2.entities.concretes.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvDto {
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String coverLetter;
	private String schoolName;
	private String department;
	private String startDate;
	private String endDate;
	private String language;
	private String languageLevel;;
	private String talent;
	private String githubAddress;
	private String linkedinAddress;
	private String companyName;
	private String position;
	private String jobStartDate;
	private String jobEndDate;
//	

}

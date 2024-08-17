package kodlamaio.hrms2.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="employer_id", referencedColumnName = "id")
public class Employer extends User{
	
	
	@Column(name="web_site")
	private String webSite;
	@Column(name="company_name")
	private String companyName;
	@Column(name="phone_number")
	private String phoneNumber;
	

}

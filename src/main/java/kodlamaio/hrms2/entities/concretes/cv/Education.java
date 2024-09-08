package kodlamaio.hrms2.entities.concretes.cv;

import jakarta.persistence.*;
import kodlamaio.hrms2.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="educations")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="school_name")
	private String schoolName;
	@Column(name="department")
	private String department;
	@Column(name="start_date")
	private String startDate;
	@Column(name="end_date")
	private String endDate;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;


}

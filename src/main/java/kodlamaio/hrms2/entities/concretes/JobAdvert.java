package kodlamaio.hrms2.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_adverts")
public class JobAdvert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="description")
	private String description;
	@Column(name="max_salary")
	private double maxSalary;
	@Column(name="min_salary")
	private double minSalary;
	@Column(name="number_of_positions")
	private int numberOfPositions;
	@Column(name="application_deadline")
	private String applicationDeadline;
	
	
	@ManyToOne
	@JoinColumn(name="position_id")
	private JobPosition jobPosition;
	
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;

}

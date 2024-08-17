package kodlamaio.hrms2.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_positions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="job_title")
	private String jotTitle;
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert>jobAdverts;
	
	
}

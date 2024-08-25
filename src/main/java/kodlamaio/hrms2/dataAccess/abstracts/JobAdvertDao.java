package kodlamaio.hrms2.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{
	
	List<JobAdvert>getByCity_Id(int cityId);
	List<JobAdvert>getByJobPosition_Id(int jobPositionId);
	List<JobAdvert>getByCity_IdAndJobPosition_Id(int cityId,int jobPositionId);
	
	
	

}

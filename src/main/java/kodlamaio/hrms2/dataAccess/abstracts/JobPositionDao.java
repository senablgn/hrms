package kodlamaio.hrms2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}

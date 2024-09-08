package kodlamaio.hrms2.dataAccess.abstracts.cvDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.cv.Talent;

public interface TalentDao extends JpaRepository<Talent, Integer>{

}

package kodlamaio.hrms2.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms2.entities.concretes.Candidate;
import kodlamaio.hrms2.entities.concretes.dtos.CvDto;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

	// select c.candidate_id,c.first_name,e.school_name from candidates c inner join
	// educations e
	// on c.candidate_id=e.candidate_id
	// BOŞLUKLAR ÖNEMLİ

	@Query("select new kodlamaio.hrms2.entities.concretes.dtos.CvDto"
		       + "(c.id, c.firstName, c.lastName, c.dateOfBirth, cov.coverLetter, e.schoolName, e.department, e.startDate, e.endDate,"
		       + "l.language,l.languageLevel, t.talent, w.githubAddress, w.linkedinAddress,work.companyName,"
		       + "work.position,work.jobStartDate,work.jobEndDate)"
		       + "from Candidate c "
		       + "left join c.coverLetters cov "
		       + "left join c.educations e "
		       + "left join c.languages l "
		       + "left join c.talents t "
		       + "left join c.webAddress w "
		       + "inner join c.workExperiences work ")
		List<CvDto> getCvDtos();

//	@Query("select new kodlamaio.hrms2.entities.concretes.dtos.CvDto"
//			+ "(c.id, c.firstName, c.lastName, c.dateOfBirth, cov.coverLetter, e.schoolName,"
//			+ " e.department, e.startDate, e.endDate,"
//			+ "GROUP_CONCAT(l.language), GROUP_CONCAT(l.languageLevel), t.talent, w.githubAddress,"
//			+ " w.linkedinAddress, work.companyName," + "work.position, work.jobStartDate, work.jobEndDate)"
//			+ "from Candidate c " + "left join c.coverLetters cov " + "left join c.educations e "
//			+ "left join c.languages l " + "left join c.talents t " + "left join c.webAddress w "
//			+ "inner join c.workExperiences work " + "group by c.id")
//	List<CvDto> getCvDtos();

}

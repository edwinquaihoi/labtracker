package au.com.ibm.labtracker.dao.relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import au.com.ibm.labtracker.model.relational.Enrollment;
import au.com.ibm.labtracker.model.relational.EnrollmentPk;

@NoRepositoryBean
@Repo
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPk>{

}

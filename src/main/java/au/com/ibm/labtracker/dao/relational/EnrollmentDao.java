package au.com.ibm.labtracker.dao.relational;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import au.com.ibm.labtracker.dao.Dao;
import au.com.ibm.labtracker.dao.IEnrollmentDao;
import au.com.ibm.labtracker.dao.relational.repository.EnrollmentRepository;
import au.com.ibm.labtracker.model.relational.Enrollment;
import au.com.ibm.labtracker.model.relational.EnrollmentPk;


@Dao
public class EnrollmentDao extends AbstractDao<Enrollment, EnrollmentPk, EnrollmentRepository> implements IEnrollmentDao {

	@Override
	@PostConstruct
	public void init() {
		JpaRepositoryFactory factory = new JpaRepositoryFactory(getEntityManager());
		setRepository(factory.getRepository(EnrollmentRepository.class));
	}
}

package au.com.ibm.labtracker.dao;

import org.springframework.data.repository.NoRepositoryBean;

import au.com.ibm.labtracker.dao.relational.repository.EnrollmentRepository;
import au.com.ibm.labtracker.model.relational.AppUser;
import au.com.ibm.labtracker.model.relational.Enrollment;
import au.com.ibm.labtracker.model.relational.EnrollmentPk;
import au.com.ibm.labtracker.model.relational.TrainingEvent;
import au.com.ibm.labtracker.scaffold.IDao;

@NoRepositoryBean
public interface IEnrollmentDao extends IDao<Enrollment, EnrollmentPk, EnrollmentRepository> , EnrollmentRepository {

}

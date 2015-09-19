package au.com.ibm.labtracker.dao.relational;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import au.com.ibm.labtracker.dao.Dao;
import au.com.ibm.labtracker.dao.ITrainingEventDao;
import au.com.ibm.labtracker.dao.relational.repository.TrainingEventRepository;
import au.com.ibm.labtracker.model.relational.TrainingEvent;


@Dao
public class TrainingEventDao extends AbstractDao<TrainingEvent, String, TrainingEventRepository> implements ITrainingEventDao {

	@Override
	@PostConstruct
	public void init() {
		JpaRepositoryFactory factory = new JpaRepositoryFactory(getEntityManager());
		setRepository(factory.getRepository(TrainingEventRepository.class));
	}
}

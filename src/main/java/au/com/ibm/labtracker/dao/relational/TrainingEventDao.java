package au.com.ibm.labtracker.dao.relational;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import au.com.ibm.labtracker.dao.Dao;
import au.com.ibm.labtracker.dao.ITrainingEventDao;
import au.com.ibm.labtracker.dao.relational.repository.TrainingEventRepository;
import au.com.ibm.labtracker.model.relational.TrainingEvent;
import au.com.ibm.labtracker.model.relational.TrainingEventLab;


@Dao
public class TrainingEventDao extends AbstractDao<TrainingEvent, String, TrainingEventRepository> implements ITrainingEventDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(TrainingEventDao.class);
	
	@Override
	@PostConstruct
	public void init() {
		JpaRepositoryFactory factory = new JpaRepositoryFactory(getEntityManager());
		setRepository(factory.getRepository(TrainingEventRepository.class));
	}

	@Override
	public TrainingEvent addLab(TrainingEvent trainingEvent, TrainingEventLab lab) {
		trainingEvent.getLabs().add(lab);		
		return getRepository().saveAndFlush(trainingEvent);
	}

	@Override
	public TrainingEvent deleteLab(TrainingEvent trainingEvent, TrainingEventLab lab) {
		
		LOGGER.info("event=deleteLab, success=" + trainingEvent.getLabs().remove(lab));
		
		return getRepository().saveAndFlush(trainingEvent);
	}
}

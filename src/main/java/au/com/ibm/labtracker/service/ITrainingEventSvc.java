package au.com.ibm.labtracker.service;

import javax.ejb.Local;

import au.com.ibm.labtracker.dao.ITrainingEventDao;
import au.com.ibm.labtracker.dao.relational.repository.TrainingEventRepository;
import au.com.ibm.labtracker.model.relational.TrainingEvent;
import au.com.ibm.labtracker.scaffold.IService;

@Local
public interface ITrainingEventSvc extends IService<TrainingEvent, String, TrainingEventRepository, ITrainingEventDao> {

}

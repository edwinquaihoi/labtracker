package au.com.ibm.labtracker.service.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import au.com.ibm.labtracker.dao.Dao;
import au.com.ibm.labtracker.dao.ITrainingEventDao;
import au.com.ibm.labtracker.service.ITrainingEventSvc;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class TrainingEventSvc implements ITrainingEventSvc {

	@Inject
	@Dao
	private ITrainingEventDao dao;

	public ITrainingEventDao getDao() {
		return dao;
	}

	public void setDao(ITrainingEventDao dao) {
		this.dao = dao;
	}
}

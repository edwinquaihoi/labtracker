package au.com.ibm.labtracker.model.relational;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import au.com.ibm.labtracker.scaffold.AbstractMasterEntity;

@Entity
@IdClass(TrainingEventLabPk.class) 
public class TrainingEventLab extends AbstractMasterEntity<TrainingEventLabPk>{

	private static final long serialVersionUID = 1812460886909413488L;

	@Id
	private int number;
	
	@Id
	@ManyToOne
	private TrainingEvent trainingEvent;
	
	private String description;
	
	@Version
	private int version;
	
	@Override
	public String getSearchResultInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingEventLabPk getId() {
		return new TrainingEventLabPk(getNumber(), getTrainingEvent().getId());
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public TrainingEvent getTrainingEvent() {
		return trainingEvent;
	}

	public void setTrainingEvent(TrainingEvent trainingEvent) {
		this.trainingEvent = trainingEvent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}

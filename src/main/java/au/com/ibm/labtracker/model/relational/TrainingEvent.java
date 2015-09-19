package au.com.ibm.labtracker.model.relational;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import au.com.ibm.labtracker.scaffold.AbstractMasterEntity;

@Entity
public class TrainingEvent extends AbstractMasterEntity<Long> {

	private static final long serialVersionUID = 3282493435258931916L;

	@Id
	private long id;
	
	@Temporal(TemporalType.TIME)
	private Date startDate;
	
	@Temporal(TemporalType.TIME)
	private Date endDate;

	@Version
	private int version;
	
	@OneToMany
	private List<TrainingEventLab> labs;
	
	@Override
	public String getSearchResultInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}

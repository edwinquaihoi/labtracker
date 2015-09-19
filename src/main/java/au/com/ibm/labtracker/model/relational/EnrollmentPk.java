package au.com.ibm.labtracker.model.relational;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;

public class EnrollmentPk implements Serializable {

	private static final long serialVersionUID = 4133476019796534857L;

	private String appUser;
	
	private long trainingEvent;

	public EnrollmentPk() {
		// TODO Auto-generated constructor stub
	}
	
	public EnrollmentPk(String appUser, long trainingEvent) {
		super();
		this.appUser = appUser;
		this.trainingEvent = trainingEvent;
	}

	public String getAppUser() {
		return appUser;
	}

	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}

	public long getTrainingEvent() {
		return trainingEvent;
	}

	public void setTrainingEvent(long trainingEvent) {
		this.trainingEvent = trainingEvent;
	}
	
	@Override
	 public boolean equals(Object obj) {
		   if (obj == null) { return false; }
		   if (obj == this) { return true; }
		   if (obj.getClass() != getClass()) {
		     return false;
		   }
		   EnrollmentPk rhs = (EnrollmentPk) obj;
		   return new EqualsBuilder()
		                 .appendSuper(super.equals(obj))
		                 .append(appUser, rhs.appUser)
		                 .append(trainingEvent, rhs.trainingEvent)
		                 .isEquals();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}

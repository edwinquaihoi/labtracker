package au.com.ibm.labtracker.model.relational;

import org.apache.commons.lang.builder.EqualsBuilder;

public class TrainingEventLabPk {

	private int number;
	
	private long trainingEvent;

	public TrainingEventLabPk() {
		// TODO Auto-generated constructor stub
	}
	
	public TrainingEventLabPk(int number, long trainingEvent) {
		super();
		this.number = number;
		this.trainingEvent = trainingEvent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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
		   TrainingEventLabPk rhs = (TrainingEventLabPk) obj;
		   return new EqualsBuilder()
		                 .appendSuper(super.equals(obj))
		                 .append(number, rhs.number)
		                 .append(trainingEvent, rhs.trainingEvent)
		                 .isEquals();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}

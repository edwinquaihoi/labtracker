package au.com.ibm.labtracker.model.relational;

import javax.persistence.Embeddable;

@Embeddable
public class Lab {

	private int number;
	
	private boolean complete;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}	
}

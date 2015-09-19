package au.com.ibm.labtracker.model.relational;

import javax.persistence.Embeddable;
import javax.persistence.Version;

@Embeddable
public class TrainingEventLab {

	private int number;
		
	private String description;
	
	@Version
	private int version;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

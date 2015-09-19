package au.com.ibm.labtracker.scaffold;

import com.google.gson.Gson;

public abstract class AbstractMasterEntity<K> implements IMasterPersistentEntity<K> {

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}

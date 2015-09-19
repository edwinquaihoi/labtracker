package au.com.ibm.labtracker.scaffold;

import java.io.Serializable;

public interface IMasterPersistentEntity<K> extends Serializable {
	String getSearchResultInfo();
	K getId();
}

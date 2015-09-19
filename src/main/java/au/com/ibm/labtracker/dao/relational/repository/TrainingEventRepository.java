package au.com.ibm.labtracker.dao.relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import au.com.ibm.labtracker.model.relational.AppUser;
import au.com.ibm.labtracker.model.relational.TrainingEvent;

@NoRepositoryBean
@Repo
public interface TrainingEventRepository extends JpaRepository<TrainingEvent, String>{

}

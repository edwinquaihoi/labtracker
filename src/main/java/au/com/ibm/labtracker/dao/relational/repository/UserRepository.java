package au.com.ibm.labtracker.dao.relational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import au.com.ibm.labtracker.model.relational.AppUser;

@NoRepositoryBean
@Repo
public interface UserRepository extends JpaRepository<AppUser, String>{

}

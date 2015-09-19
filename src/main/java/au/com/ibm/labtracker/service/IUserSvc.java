package au.com.ibm.labtracker.service;

import javax.ejb.Local;

import au.com.ibm.labtracker.dao.IUserDao;
import au.com.ibm.labtracker.dao.relational.repository.UserRepository;
import au.com.ibm.labtracker.model.relational.AppUser;
import au.com.ibm.labtracker.scaffold.IService;

@Local
public interface IUserSvc extends IService<AppUser, String, UserRepository, IUserDao> {

}

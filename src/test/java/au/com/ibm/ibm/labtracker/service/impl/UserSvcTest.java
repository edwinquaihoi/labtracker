package au.com.ibm.ibm.labtracker.service.impl;

import static org.junit.Assert.assertNotNull;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

import au.com.ibm.ibm.labtracker.service.ServiceTests;
import au.com.ibm.labtracker.model.relational.AppUser;
import au.com.ibm.labtracker.service.IUserSvc;

public class UserSvcTest extends ServiceTests {

	@EJB(name="UserSvcLocal")
	private IUserSvc userSvc;

	//@Test
	public void testCreate() {

		assertNotNull(userSvc);
		
		AppUser u = new AppUser();
		u.setLogin("sanket");
		u.setPassword("passw0rd");

		AppUser savedAcct = userSvc.update(u);
		
		assertNotNull(savedAcct);

	}

	@Test
	public void test() {}
}

package au.com.ibm.labtracker.dao;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import au.com.ibm.labtracker.model.config.ModelJPAConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ModelJPAConfig.class })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class RelationalTests {
}

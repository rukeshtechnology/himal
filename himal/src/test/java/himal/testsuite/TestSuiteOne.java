package himal.testsuite;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import himal.common.LoggerSetup;
import himal.dao.test.UserManagementDaoTest;

@RunWith(Suite.class)
@SuiteClasses({UserManagementDaoTest.class})
public class TestSuiteOne {

	static Logger log = LoggerSetup.getApplicationLogger(TestSuiteOne.class);
	
	@BeforeClass
	public static void setupForTestSuiteOne() {
		log.info("This is before class setup for test suite one");
	}
}

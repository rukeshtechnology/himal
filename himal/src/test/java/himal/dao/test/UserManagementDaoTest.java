package himal.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import himal.dao.UserManagementDao;
import himal.vo.User;

public class UserManagementDaoTest {

	UserManagementDao userManagementDao = new UserManagementDao(); 
	
	@Ignore
	@Before
	public void getUserManagementDao() {
		userManagementDao = new UserManagementDao();
	}
	
	@Ignore
	@Test
	public void testCreateUser() {
		User user = userManagementDao.getUser();
		assertEquals("Rukesh", user.getFirstName());
	}

	@Test
	public void testGetUser() {
		User user = userManagementDao.getUser();
		assertEquals("Rukesh", user.getFirstName());
	}	

	@Ignore
	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

}

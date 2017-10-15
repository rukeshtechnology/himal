package himal.dao;

import himal.vo.User;

public class UserManagementDao implements IUserManagement {

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User getUser() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setFirstName("Rukesh");
		user.setLastName("Tamrakar");
		user.setStreetAddress("24913 Earlsforld Dr");
		user.setCity("Chantilly");
		user.setZip("20152");
		return user;
	}

	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	
}

package himal.dao;

import himal.vo.User;

public interface IUserManagement {
	
	public void createUser(User user);
	public User getUser();
	public void updateUser();
	public void deleteUser(User user);	

}

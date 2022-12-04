package com.ums.dao;

public interface UserDao {
	void Register();
	boolean verifyUsernameAndPassword(String email, String password);
	String forgetPassword(String email);
}//end of UserDao

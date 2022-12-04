package com.ums.dao.Impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.ums.dao.UserDao;
import com.ums.pojo.User;

public class UserDaoImpl implements UserDao {
	Scanner sc=new Scanner(System.in);
	
	//Create an ArrayList object to hold the list of added user.
	ArrayList<User> userList=new ArrayList<User>();
	
	//Create object of user to set & get value
	User user=new User();
	
	@Override
	public void Register() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter user id : ");
		int uid=sc.nextInt();
		user.setUid(uid);
		
		System.out.println("Enter user firstname : ");
		String firstname=sc.next();
		user.setFirstname(firstname);
		
		System.out.println("Enter user lastname : ");
		String lastname=sc.next();
		user.setLastname(lastname);
		
		System.out.println("Enter user email : ");
		String email=sc.next();
		user.setEmail(email);
		
		System.out.println("Enter user password : ");
		String password=sc.next();
		user.setPassword(password);
		
		System.out.println("Enter user mobile number : ");
		long mobilenumber=sc.nextLong();
		user.setMobilenumber(mobilenumber);
		userList.add(user);
		
		for(User u:userList) {
			System.out.println("Following user has been registered!!!");
			System.out.println(u.getUid()+"\t"+u.getEmail()+"\t"+u.getFirstname()+"\t"+u.getLastname()+"\t"+u.getMobilenumber());
		}
		
	}//end of Register

	@Override
	public boolean verifyUsernameAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}//end of verifyUsernameAndPassword

	@Override
	public String forgetPassword(String email) {
		// TODO Auto-generated method stub
		
		if(user.getEmail().equals(email)) {
			System.out.println("Enter user password : ");
			String password=sc.next();
			user.setPassword(password);
			userList.add(user);
			return user.getEmail();
		}
		return null;
	}//end of forgetPassword

}//end of UserDaoImpl

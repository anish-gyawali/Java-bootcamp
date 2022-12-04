package com.ums.client;

import java.util.Scanner;

import com.ums.dao.Impl.UserDaoImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserDaoImpl userDemo = new UserDaoImpl();

		while (true) {
			System.out.println("1. Register ");
			System.out.println("2. login ");
			System.out.println("3. Forget password ");
			System.out.println("4. Exit ");
			System.out.println("Please enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Registration");
				userDemo.Register();
				break;
			case 2:
				System.out.println("Login");
				System.out.println("Enter user email : ");
				String email = sc.next();

				System.out.println("Enter user password : ");
				String password = sc.next();

				boolean loginCheck = userDemo.verifyUsernameAndPassword(email, password);

				if (!loginCheck) {
					System.out.println("Invalid! Please check your username and password");
				} else {
					System.out.println("Login success!!!");
				}
				break;

			case 3:
				System.out.println("Update your password here!!");

				System.out.println("Enter user email : ");
				String userEmail = sc.next();
				String updatedUser = userDemo.forgetPassword(userEmail);
				
				if(updatedUser!=null) {
				System.out.println( updatedUser+ " Password has been updated" );
				}else {
					System.out.println("User not found! Please check you email.");
				}
				break;

			case 4:
				System.out.println("Thank you for using!!!");
				System.exit(0);

			default:
				System.out.println("please choose between 1 to 4");
				
			}//end of switch
			
		}//end of while loop
	}

}//end of UserClient

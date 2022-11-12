package com.pms.client;

import java.util.Scanner;

import com.pms.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ProductDetails pDetails=new ProductDetails();
		
		while(true) {
			System.out.println("******************************");
			System.out.println("1.Student");
			System.out.println("2.Exit ");
			System.out.println("******************************");
			System.out.println("Enter your choice (1-2): ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Username");
				String uName=sc.next();
				System.out.println("Enter Password");
				String password=sc.next();
				
				if(uName.equals("admin")&& password.equals("admin@123")) {
					pDetails.productDetails();
				}else {
					System.out.println("Invalid user");
				}
				
				break;
				
			case 2: 
				System.out.println("Thank you for using");
				System.exit(0);
				break;
			default:
				System.out.println("Choose between 1-2 ");
			}//end of switch case
			
		}//end of while loop
		
	}

}

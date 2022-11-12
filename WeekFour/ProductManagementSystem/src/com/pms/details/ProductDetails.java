package com.pms.details;

import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.dao.impl.ProductDaoImpl;
import com.pms.pojo.Product;

public class ProductDetails {

	Scanner sc = new Scanner(System.in);
	ProductDaoImpl product = new ProductDaoImpl();

	public void productDetails() {		
		while (true) {
			System.out.println("******************************");
			System.out.println("1. Add Product: ");
			System.out.println("2. View All Product: ");
			System.out.println("3. View Product: ");
			System.out.println("4. Back  ");
			System.out.println("******************************");
			System.out.println("Enter your choice (1-4): ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				product.addProduct();
				productDetails();
				break;
				
			case 2:
				Product[] viewAllProducts = product.viewAllProducts();
				if(viewAllProducts!=null) {
				for (Product prod : viewAllProducts) {
					System.out.println(prod.getPid() + "\t" + prod.getPname() + "\t" + prod.getPrice() + prod.getQty());
				}
				}else {
					System.out.println("No product available");
				}
				productDetails();
				break;

			case 3:
				System.out.println("Enter Product Id: ");
				int num = sc.nextInt();
				Product viewProduct = product.viewProduct(num);
				
				if (viewProduct != null) {
					System.out.println(viewProduct.getPid() + "\t" + viewProduct.getPname() + "\t"
							+ viewProduct.getPrice() + viewProduct.getQty());
				} else {
					System.out.println("Product not found !!");
				}
				productDetails();
				break;

			case 4:
				ProductClient.main(null);
				break;

			default:
				System.out.println("Choose between 1 - 4");

			}// end of switch case

		} // end of while loop

	}// end of productDetails
}

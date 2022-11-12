package com.pms.dao.impl;

import java.util.Scanner;

import com.pms.pojo.Product;

public class ProductDaoImpl {

	Scanner sc = new Scanner(System.in);
	public Product[] addProductsInfo = null;

	public void addProduct() {

		System.out.println("How Many product do want to Add ? ");
		int size = sc.nextInt();
		addProductsInfo = new Product[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter Product Id: ");
			int id = sc.nextInt();

			System.out.println("Enter Product Name: ");
			String name = sc.next();

			System.out.println("Enter Product Quantity: ");
			int quantity = sc.nextInt();

			System.out.println("Enter Product Price: ");
			double pc = sc.nextDouble();

			// Store the data inside Project Object
			// Parameterized constructor
			Product product = new Product(id, name, quantity, pc);
			addProductsInfo[i] = product;

			System.out.println("Added Product Successfully!!");

		} // end of for loop

	}// end of addProduct

	public Product[] viewAllProducts() {

		return addProductsInfo;

	}// end of viewAllProducts

	public Product viewProduct(int id) {

		if (addProductsInfo != null) {
			for (Product prod : addProductsInfo) {

				if (prod.getPid() == id) {
					return prod;
				}

			} // end of forEach loop
		}
		return null;

	}// end of viewProduct
}

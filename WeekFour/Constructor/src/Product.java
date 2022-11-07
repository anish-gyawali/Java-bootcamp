import java.util.Scanner;

public class Product {

	int pno;
	String pname;
	int qty;
	double price;

	public Product(int pno, String pname, int qty, double price) {
		this.pno = pno;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	void viewProduct() {
		System.out.println(pno + " " + pname + " " + qty + " " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		Product prod = null;

		while (true) {

			System.out.println("1. Add Product");
			System.out.println("2. View Product");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			int choice = sn.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter product number: ");
				int p = sn.nextInt();

				System.out.println("Enter product name: ");
				String product = sn.next();

				System.out.println("Enter product qty: ");
				int q = sn.nextInt();

				System.out.println("Enter product price: ");
				double price = sn.nextDouble();

				prod = new Product(p, product, q, price);
				System.out.println(" Product added successfully");
				break;
			case 2:
				prod.viewProduct();
				break;
			case 3:
				System.out.println("Thanks for using !!");
				System.exit(0);
			default:
				System.out.println("Choose between 1 to 3");
			}
		}

	}

}

//Create a Java class product
//Define variable pid, pname, qty, price
//specify method void display()
//access Method from Main()
//Output:
/*
 PID  Pname Qty Price
 100  TV    10  2500
 */
public class Product {

	int pid;
	String pname;
	int qty;
	int price;

	void display() {
		System.out.println("PId" + " " + "Pname" + " " + "Qty" + " " + "Price");
		pid = 100;
		pname = "TV";
		qty = 10;
		price = 2500;
		System.out.println(pid + "  " + pname + "   " + qty + "   " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product();
		product.display();

	}

}

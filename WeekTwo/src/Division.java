/*
 Create a class division
 Declare variable fno,n
 Define method void div()
 access the method from main()
 */

public class Division {

	int fno, n;
	float result;

	void div() {
		System.out.println("To perform division:");

		fno = 75;
		n = 8;
		result = fno / n;

		System.out.println(fno + " divided by " + n + " is: " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Division division = new Division();
		division.div();
	}

}

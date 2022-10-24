
public class Employee {

	// non-static variable/ Instance Variable

	int eno;
	String ename;
	double esal;

	boolean flag = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		System.out.println(emp.eno + " " + emp.ename + " " + emp.esal + " " + emp.flag);
		emp.eno = 1000;
		emp.ename = "Anish";
		emp.esal = 85000;

		System.out.println(emp.eno + "\t " + emp.ename + "\t " + emp.esal);
	}

}

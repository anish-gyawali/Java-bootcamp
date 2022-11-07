
public class Employee {

	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		
		this.eno = eno;
		this.ename = ename;
	}
	
	void displayDetail() {
		System.out.println(eno+"\t"+ename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee(100, "Anish");
		Employee emp1= new Employee(10, "Ansu");
		
		emp.displayDetail();
		emp1.displayDetail();
	}

}

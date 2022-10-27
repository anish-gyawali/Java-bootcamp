/*
 ) Static varibles and Method can access directly From Static Methods
note:  without creating Object we can access.



2) Static varibles and Method can access Using ClassName from Static Static Methods
    eg:   class Employee{  static int eno=100; p.s.v.m(s[]args){  s.o.p(Employee.eno);



3)Static varibles and Method can access Creating Object from Static Methods



4)Static varibles and Method can access Directly from Non-static Methods
5)Referece Varible once have a null, we can access Static varibles and Method can access Using Referece varible,
 */

public class StaticDemo {
	
		static int i =100;
		
		static void display() {
			System.out.println("Display static method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Directly"+i);
		display();
		
		System.out.println("Access static vaibale using className"+StaticDemo.i);
		StaticDemo.display();
	}

}

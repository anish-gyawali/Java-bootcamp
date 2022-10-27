//simple flow and use of static variable
public class StaticDemo {
	
		static int i =100;
		
		static void display() {
			System.out.println("Display static method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Static variables and Method can access directly From Static Method*/
		System.out.println("Directly"+i);
		display();
		
		/*Static variables and Method can access Using ClassName from Static Methods*/
		System.out.println("Access static varibale using className"+StaticDemo.i);
		StaticDemo.display();
		
		/*Static variables and Method can access Creating Object from Static Methods*/
		StaticDemo demo= new StaticDemo();
		System.out.println("Access static variable by creating object"+demo.i);
		demo.display();
		
		/*Reference variable once have a null, we can access Static variables and Method can access Using Reference variable*/
		StaticDemo demo1= null;
		System.out.println("we can access Static varibles if Referece Varible is null"+demo.i);
		demo1.display();
	}

}

//You need to create object to call non- static variable
public class Swap {

	int a=200;
	int b=300;
	int temp=0;
	
	void swapWithTemp() {
		System.out.println("Before swapping:");
		System.out.println("a="+" "+a+" "+"b="+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:");
		System.out.println("a="+" "+a+" "+"b="+b);
				
	}
	
	void swapWithoutTemp() {
		System.out.println("Before swapping:");
		System.out.println("a="+" "+a+" "+"b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:");
		System.out.println("a="+" "+a+" "+"b="+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap demo= new Swap();
		demo.swapWithTemp();
		
		System.out.println("****swap Without Temp****");
		demo.swapWithoutTemp();
	}

}

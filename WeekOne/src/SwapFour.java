//swap Four numbers using temp variable 

public class SwapFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		int c=300;
		int d=400;
		System.out.println("Before swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c+" d="+" "+d);
		
		int temp=0;
		temp=c;
		c=b;
		b=a;
		a=d;
		d=temp;
		System.out.println("After swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c+" d="+" "+d);
		
	}

}

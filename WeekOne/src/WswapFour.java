//swap Four numbers using without temp variable 

public class WswapFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int c=300;
		int d=400;
		System.out.println("Before swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c+" d="+" "+d);
		
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		System.out.println("After swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c+" d="+" "+d);
		
	}

}

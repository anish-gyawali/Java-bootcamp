//swap three numbers  with temp variable 

public class SwapThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 100;
		int b=200;
		int c=300;
		System.out.println("Before swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c);
		
		int temp=0;
		temp=b;
		b=a;
		a=c;
		c=temp;
		System.out.println("After swapping: ");
		System.out.println("a="+" "+a+" b="+" "+b+" c="+" "+c);
		
	}

}

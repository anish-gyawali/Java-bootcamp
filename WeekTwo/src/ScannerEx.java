//Use of Scanner

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Number");
		int sno=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String sname=sc.next();
		
		System.out.println("Enter Student Fee");
		double sfee=sc.nextDouble();
		
		System.out.println("Enter Mobile Number");
		long mn=sc.nextLong();
		
		System.out.println(sno+"\t"+sname+"\t"+sfee+"\t"+mn);
	}

}

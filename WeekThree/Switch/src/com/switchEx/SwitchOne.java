/* example for use of "switch*/
/*
 Switch accepts the arguments (byte, string, short) check the multiple conditions 
 */

package com.switchEx;

public class SwitchOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=20;
		switch(b) {
		case 10:
			System.out.println("Printed case 10");
			break;
		case 20:
			System.out.println("Printed case 20");
			break;
		case 30:
			System.out.println("Printed case 30");
			break;
		case 40:
			System.out.println("Printed case 40");
			break;
		default:
			System.out.println("Printed case 50");
		}
	}

}

//MethodOverriding
package com.method;

class A {
	void funX() {
		System.out.println("A class funx");
	}

	void funY() {
		System.out.println("A class funY");
	}

}

class B extends A {

	// Overriding
	void funX() {
		super.funX(); // if both method are same and we want to display them we need to use super
		System.out.println("B class funx");
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.funX();
		b.funY();
	}

}

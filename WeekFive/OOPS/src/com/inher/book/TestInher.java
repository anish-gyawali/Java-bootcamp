// Multi-level Inheritance 

package com.inher.book;

class Animal{
	void eat() {
		System.out.println("Animal eating ......");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Animal barking ......");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("Animal weeping ......");
	}
}
public class TestInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog bd= new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}

}

package com.abstractex;

public class AdditionClient extends Addition {

	@Override
	int add(int fno, int sno) {
		// TODO Auto-generated method stub
		return fno+sno;
	}

	public static void main(String[] args) {
		AdditionClient ad = new AdditionClient();
		int result=ad.add(200, 300);
		System.out.println("addition of two number: "+result);
	}
}

package com.student;

public class CorporateBatchStudent extends Student {
	@Override
	public int CalculateFee(String courses) {

		if (courses.equals("python")) {
			return 2000;
		}
		return 0;
	}
}

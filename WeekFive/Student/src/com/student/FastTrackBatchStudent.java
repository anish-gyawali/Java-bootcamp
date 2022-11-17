package com.student;

public class FastTrackBatchStudent extends Student {

	@Override
	public int CalculateFee(String courses) {

		if (courses.equals("Java")) {
			return 5000;
		}
		return 0;
	}
}

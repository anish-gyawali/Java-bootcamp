package com.student;

public class StudentClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastTrackBatchStudent fstud = new FastTrackBatchStudent();
		fstud.setSno(10);
		fstud.setSname("Anish");
		fstud.setMobilenumber(984306633);
		fstud.setAddress("Hammond");
		fstud.setCourse("Java");
		int ftFee = fstud.CalculateFee("Java");
		System.out.println(ftFee);

	}

}

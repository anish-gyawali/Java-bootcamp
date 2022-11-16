package com.inher.book;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
		bk.setBid(1);
		bk.setBname("Naya");
		bk.setBprice(2500);
		bk.setBtype("Novel");

		System.out.println(bk.getBid() + "\t" + bk.getBname() + "\t" + bk.getBprice() + "\t" + bk.getBtype());

		AnnualBook ae = new AnnualBook();
		ae.setBid(2);
		ae.setBname("Java");
		ae.setBprice(250);
		ae.setBtype("Programming");
		ae.setDiscount(20);
		System.out.println(ae.getBid() + "\t" + ae.getBname() + "\t" + ae.getBprice() + "\t" + ae.getBtype() + "\t"
				+ ae.getDiscount());

		SpecialEditionBook se = new SpecialEditionBook();
		se.setBid(2);
		se.setBname("C#");
		se.setBprice(2530);
		se.setBtype("Programming");
		se.setCds("video");
		System.out.println(
				se.getBid() + "\t" + se.getBname() + "\t" + se.getBprice() + "\t" + se.getBtype() + "\t" + se.getCds());

	}

}

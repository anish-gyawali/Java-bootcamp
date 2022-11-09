//set is used to set value into data
//get is use to get value from the data

public class Student {
		int sno;
		String sname;
		
	public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setSno(10);
		stu.setSname("Anish");
		System.out.println(stu.getSno()+"\t"+stu.getSname());
	}

}

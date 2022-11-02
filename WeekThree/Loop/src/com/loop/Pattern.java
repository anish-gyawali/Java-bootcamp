package com.loop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  @@@@@@
		  @@@@@@
		 */
		for(int i=0;i<2;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		/*
		 11111
		 11111
         11111
         11111
         11111 
		 */		
		for(int k=0;k<5;k++) {
			for(int l=0;l<5;l++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		/*
		  11111
          22222
          33333
          44444
          55555
		 */		
		for(int m=1;m<6;m++) {
			for(int n=0;n<5;n++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
		/*print number from 1 to 50, 5 column only*/
		int r=1;
		for(int p=0;p<10;++p) {
			for(int q=0;q<5;++q) {
				System.out.print(r+" ");
				++r;
			}
			System.out.println();
		}
		
		
		/*Print even number up to 100*/
		
		int t=2;
		for(int u=0;u<10;++u) {
			for(int v=0;v<5;++v) {		
				System.out.print(t+" ");
				t=t+2;
			}
			System.out.println();
			
		}
		
		/*Print odd number up to 99. like 1,3,5.....99*/
		
		int w=1;
		for(int x=0;x<10;++x) {
			for(int y=0;y<5;++y) {		
				System.out.print(w+" ");
				w=w+2;
			}
			System.out.println();
			
		}
		
		/*Print pattern as 0,5,10,15,....100*/
		
		int a=0;
		for(int b=0;b<10;++b) {
			for(int c=0;c<5;++c) {	
				if(a<=100)
				System.out.print(a+" ");
				a=a+5;	
			}
			System.out.println();
			
		}
	}

}

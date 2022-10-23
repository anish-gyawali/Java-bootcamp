//Scenario: siva and venkat went to Domino , they ordered 2 pizza ,Each pizza cost $300. 
//Condition:  20 % discount for two pizza ? 
//To find: price paid by siva and venkat
public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pizza_price=300;
		int total_pizza=2;
		float discount_percentage =20;
		
		int total_cost=0;
		float discount_price=0;
		float final_price=0;
		
		total_cost=(pizza_price*total_pizza);
		
		discount_price=(discount_percentage/100)*total_cost;
		
		final_price=total_cost-discount_price;
		
		System.out.println("The cost of two pizza is : $"+total_cost);
		System.out.println("The cost of two pizza after 20% discount is : $"+final_price);
	}

}

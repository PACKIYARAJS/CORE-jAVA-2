package comjavacorejavaWelcome;

import java.util.Scanner;

public class ControlStatement {
	
	public void DecisionMaking() {
		
		     // IF STATEMENT, IF ELSE STATEMENT, IF ELSE IF LADDER STATEMENT, NESTED IF STATEMENT
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("ENTER YOUR AGE : ");
		
		int age = u.nextInt();
		
		if(age>=18) {
			
			System.out.println("Eligible for Vote");
			
			if(age>=55) {
				
				System.out.println("Eligible for Pension ");
				
			}
			
			else {
				
				System.out.println("Not Eligible for pension");
				
			}
			
		 }
		
		 else if(age==17) {
		
			System.out.println("Apply for Vote Id Card ");
			
		 }
		
		 else {
			
			System.out.println("Not Eligible");
			
		 }
		
	 }
	
	
	public void switchStatement(){
		
		System.out.println("Enter the number :");
		
		Scanner u = new Scanner(System.in);
		
		int number = u.nextInt();
		
		switch(number) {
		
		case 10:
			
			System.out.println("Number is "+number);
			
			break;
			
		case 20:
			
			System.out.println("Number is "+number);
			
			break;
			
		case 30:
	
			System.out.println("Number is "+number);
			
			break;
		
			default:
				
				System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		
		ControlStatement c =new ControlStatement();
		
		//c.DecisionMaking();
		
		c.switchStatement();
		
	} 
	
}

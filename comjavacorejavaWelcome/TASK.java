package comjavacorejavaWelcome;

import java.util.Scanner;

public class TASK {
	
	public void task1() {
		
		System.out.println("Enter your Mark : ");
		
		Scanner u = new Scanner(System.in);
		
		int mark = u.nextInt();
		
		if(mark>=35 && mark<50) {
			
			System.out.println("C Grade");
			
		}
		
		else if(mark>=50 && mark<60) {
			
			System.out.println("C+ Grade");
			
		}
		
		else if(mark>=60 && mark<70) {
			
			System.out.println("B Grade");
			
		} 
		
		else if (mark>=70 && mark<80) {
			
			System.out.println("B+ Grade");
			
		}
		
		else if(mark>=80 && mark<90) {
			
			System.out.println("A Grade");
			
		}
		
		else if (mark>=90 && mark<=100) {
			
			System.out.println("A+ Grade");
			
		}
		
		else {
			
			System.out.println("Failed");
			
		}
		
	}
	
	
	public void task2() {
		
		System.out.println("Enter the value :");
		
		Scanner u = new Scanner(System.in);
		
		int value = u.nextInt();
		
		if (value %2==0) {
			
			System.out.println("Value Divided by 2");
			
			if(value %5==0) {
				
				System.out.println("Also Value Divided by 5");
				
			}
			
			else {
				
				System.out.println("But not Divided by 5");
				
			}
			
		}
		
		else if (value %3==0) {
			
			System.out.println("Value Divided by 3");
			
			if (value %6==0) {
				
				System.out.println("Also Value Divided by 6");
				
			}
			
			else {
				
				System.out.println("But not Divided by 6");
				
			}

		}
		
		else {
			
			System.out.println("Invalid");}
		
	}
	
	
	public void task3() {
		
		System.out.println("Enter your Percentage of Mark :");
		
		Scanner u = new Scanner(System.in);
		
		int value = u.nextInt();
		
		if(value >=35&& value<50) {
			
			System.out.println("Your mark "+value+"\nC Grade");
			
		}
		
		else if(value>=50 && value<60) {
			
			System.out.println("Your mark"+value+"\nC+ Grade");
			
		}
		
		else if (value>=60 && value<70) {
			
			System.out.println("Your mark"+value+"\nB Grade");
			
		}
		
		else if (value>=70 && value<80) {
			
			System.out.println("Your mark"+value+"\nB+ Grade");
			
		}
		
		else if(value>=80 && value<90) {
			
			System.out.println("Your mark"+value+"\nA Grade");
			
		}
		
		else if (value>=90 && value <=100) {
			
			System.out.println("Your mark"+value+"\nA+ Grade");
			
		}
		
		else {
			
			System.out.println("Failed");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TASK t = new TASK();
		
		t.task3();
		
	}

}

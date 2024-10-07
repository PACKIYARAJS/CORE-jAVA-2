package comjavacorejavaWelcome;

import java.util.Scanner;

public class SwitchStatementTask {
	
	public static void main(String[] args) {
		
		Scanner u = new Scanner(System.in);
		
	    System.out.println("Enter the 1st number :");
	    
	    int first= u.nextInt();
	    
	    System.out.println("Enter the 2nd number :");
	    
	    int second = u.nextInt();
	    
	    System.out.println("Calculation :");
	    
        char operator = u.next().charAt(0);
	    
	    switch(operator) {
	    
	    case '+':
	    	
	    	System.out.println(first+second);
	    	
	    	break;
	    	
	    case '-':
	    	
	    	System.out.println(first-second);
	    	
	    	break;
	    	
	    case '*':
	    	
	    	System.out.println(first*second);
	    	
	    	break;
	    	
	    case '/':
	    	
	    	System.out.println(first/second);
	    	
	    	break;
	    	
	    case '%':
	    	
	    	System.out.println(first%second);
	    	
	    	break;	
	    
	    }
		
	}

}

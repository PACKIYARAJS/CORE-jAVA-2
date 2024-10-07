package comjavacorejavaWelcome;

public class UnaryOperator {
	
	public static void main (String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		System.out.println(a++);		// Post Increment
		
		System.out.println(++a);	    // Pre-Increment
		
		System.out.println(b--);	    // Post Decrement
		
		System.out.println(--b);	    // pre-Decrement
		
		int c = 1;
		
		int d = 2;
		
		System.out.println(c++ + c++);	//  Both are Post Increment 
		
		System.out.println(d++ + ++d);	// Post Increment and Pre-Increment
		
		int e = 10;
		
		int f = 20;
		
		System.out.println(e-- + e-- );	//  Both are Post Decrement 
		
		System.out.println(f-- - --f);	// Post Decrement and Pre-Decrement
		
		
	}

}

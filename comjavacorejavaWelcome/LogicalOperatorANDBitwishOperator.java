package comjavacorejavaWelcome;

public class LogicalOperatorANDBitwishOperator {
	
	public static void main (String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		int c = 10;
		
		int d = 40;
		
		System.out.println(a<d && a!=d);   // Logical Operator = &&
		
		System.out.println(a<c & a!=d);    // Bitwish Operator = &
		
		System.out.println(a>d || a==b);   // Logical Operator = ||
		
		System.out.println(a<d | a==d);    // Bitwish Operator = |
		
	}
	

}

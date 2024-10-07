package comjavacorejavaWelcome;

import java.util.Scanner;

public class INPUTDATATYPE {
	
	public static void main(String[] args) {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("ENTER THE INT VALUE :");
		
		int i = u.nextInt();
		
		System.out.println("INT VALUE IS "+i);
		
		System.out.println("ENTER THE BYTE VALUE :");
		
		byte b = u.nextByte();
		
		System.out.println("BYTE VALUE IS "+b);
		
		System.out.println("ENTER THE SHORT VALUE :");
		
		short s = u.nextShort();
		
		System.out.println("SHORT VALUE IS "+s);
		
		System.out.println("ENTER THE LONG VALUE :");
		
		long l = u.nextLong();
		
		System.out.println("LONG VALUE IS "+l);
		
		System.out.println("ENTER THE FLOAT VALUE :");
		
		float f = u.nextFloat();
		
		System.out.println("FLOAT VALUE IS "+f);
		
		System.out.println("ENTER THE DOUBLE VALUE :");
		
		double d = u.nextDouble();
		
		System.out.println("DOUBLE VALUE IS "+d);
		
		System.out.println("ENTER THE CHAR VALUE :");
		
		char c = u.next().charAt(0);
		
		System.out.println("CHAR VALUE IS "+c);
		
		System.out.println("ENTER THE BOOLEAN VALUE :");
		
		boolean bo= u.nextBoolean();
		
		System.out.println("BOOLEAN VALUE IS "+bo);
		
		
		
	}

}

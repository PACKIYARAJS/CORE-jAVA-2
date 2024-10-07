package tasks;

import java.util.Scanner;

public class IfStatementTask {
	
	public void task1() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		
		int first = u.nextInt();
		
		System.out.println("Enter the second number :");
		
		int second = u.nextInt();
		
		if(first>second) {
			
			System.out.println("The maximam number is  First = "+first);
			
		}
		
		else if (second>first) {
			
			System.out.println("The maximum number is Second = "+second);
			
		}	
		
	}
	
	
	public void task2() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		
		int first = u.nextInt();
		
		System.out.println("Enter the second number :");
		
		int second = u.nextInt();
		
		System.out.println("Enter the third number :");
		
		int third = u.nextInt();
		
		if(first>second && first>third) {
			
			System.out.println("the mamimum number is first = "+first);			
		} 
		
		else if(second>first && second>third) {
			
			System.out.println("the maximum number is second = "+second);
			
		}
		
		else if (third>first && third>second) {
			
			System.out.println("the maximum number is third = "+third);
			
		}
				
	}
	
	
	public void task3() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the value :");
		
		int value = u.nextInt();
		
		if (value<0) {
			
			System.out.println(value+" is Negative value");
			
		}
		
		else if (value>0) {
			
			System.out.println(value+" is Positive value");
			
		}
		
		else if(value==0){
			
			System.out.println(value+" is Zero value");
			
		}
		
	}
	
	
	public void task4() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int number= u.nextInt();
		
		if(number%5==0) {
			
			System.out.println("The number is divisible by 5");
			
			if(number%11==0) {
				
				System.out.println("Also the number is divisible by 11");
				
			}
			
			else {
				
				System.out.println("But not divisible by 11");
				
			}
			
		}
		
		else {
			
			System.out.println("The number not divisible by 5 and 11");
			
		}
		
	}
	
	
	public void task5() {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter the value :");
		
		int value = i.nextInt();
		
		if(value%2==0) {
			
			System.out.println(value +" is even number");
			
		}
		
		else {
			
			System.out.println(value +" is odd number");
			
		}
		
	}
	
	
	public void task6() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the year :");
		
		int year = u.nextInt();
		
		if(year%400==0 || year%4==0) {
			
			System.out.println(year +" is a leap year");
			
		}
		
		else if (year%100==0) {
			
			System.out.println(year+"is not a leap year");
			
		}
		
		else {
			
			System.out.println(year+"is not a leap year");
			
		}
		
	}
	
	
	public void task7() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the character :");
		
		char value = u.next().charAt(0);
		
		if (value>='a' && value<='z'|| value>='A' && value<='Z') {
			
			System.out.println("This character is an alphabet letter");
			
		}
		
		else {
			
			System.out.println("Its not an alphabet letter");			
		}
		
	}
	
	
	public void task8() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the Character :");
		
		char value = u.next().charAt(0);
		
		if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u'
				||value=='A'||value=='E'||value=='I'||value=='O'||value=='U') {
			
			System.out.println("This is Vowels");
			
		}
		
		else {
			
			System.out.println("This is Consonant");
			
		}
		
	}
	
	
	public void task9() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the Character :");
		
		char value = u.next().charAt(0);
		
		if(value>='a' && value<='z'|| value>='A' && value<='Z') {
			
			System.out.println("This is an Alphabet");
			
		}
		
		else if (value>='0' && value <='9') {
			
			System.out.println("This is digit");
			
		}
		
		else {
			
			System.out.println("This is special character");
			
		}
		
	}
	
	
	public void task10() {
		
		Scanner u = new Scanner(System.in);
		
		System.out.println("Enter the Alphabet letter:");
		
		char value = u.next().charAt(0);
		
		if(value>='a' && value<='z') {
			
			System.out.println("This lower case");
			
		}
		
		else if(value>='A' && value<='Z') {
			
			System.out.println("This upper case");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		IfStatementTask t = new IfStatementTask();
		
		t.task10();
		
	}

}

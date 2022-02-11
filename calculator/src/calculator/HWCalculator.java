package calculator;
import java.util.Scanner;

public class HWCalculator {

	static double num1,num2, sum, sub, div, mult, x,y;
	static Scanner scan = new Scanner(System.in);
	
	static double getNumbers1() {
		System.out.println("Enter your first number");
		int userNumber1 = scan.nextInt();
		return userNumber1;
//		this static method we will do our instructions and do out int for our first user entered number
//		
	}

	static double getNumbers2() {
		System.out.println("Enter your second number");
		int userNumber2 = scan.nextInt();
		return userNumber2;
//		this static method we will do our our instructions to the user and we will initialize the second user entered number
	}
		
	static double add() {
		x= getNumbers1();
		y= getNumbers2();
//		our x is calling back our first method
//		it will print out the instructions
//		ask for a input
//		our y is calling back our second method
//		it will print out the instructions
//		ask for a input
		double sum = x+y; 
		return sum;
	}
	
	static double subtract() {
//		our x is calling back our first method
//		it will print out the instructions
//		ask for a input
//		our y is calling back our second method
//		it will print out the instructions
//		ask for a input
		x= getNumbers1();
		y= getNumbers2();
		double sub = x-y; 
		return sub;
	}
	static double division() {
//		our x is calling back our first method
//		it will print out the instructions
//		ask for a input
//		our y is calling back our second method
//		it will print out the instructions
//		ask for a input
		x= getNumbers1();
		y= getNumbers2();
	
		double div = x/y; 
		return div;
	}
	static double multiplication() {
//		our x is calling back our first method
//		it will print out the instructions
//		ask for a input
//		our y is calling back our second method
//		it will print out the instructions
//		ask for a input
		x= getNumbers1();
		y= getNumbers2();
		double mult= x*y; 
		return mult;
	}
	

	
	public static void main(String[] args) {
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("5 to exit");
		int Selection = scan.nextInt();
		
		
		switch (Selection) {
			case 1:	
			sum = add();
			System.out.println("your result is "+sum);
			break;

			case 2:
			sub = subtract();
			System.out.println("your result is "+sub);
			break;
		
			case 3:
			mult = multiplication();
			System.out.println("your result is "+mult);
			break;
		
			case 4:
			div = division();
			System.out.println("your result is "+div);
			break;
			
			case 5:
			System.exit(0);
			break;
			
			default:
			System.out.println("Please enter only 1-5");
			System.exit(0);
	
		}
		
		
		
	}
	
	
//	create switch case for add, subtract, multiply, divide, and exit
//  take user input two numbers
//	each one will have a static method, it must take in two parameters, it must have a return
//  add +, sub, -, divide /, multiply *
//	exit will be System.exit(0)
//	at the end of each one;
//	if the user enters an option aside from 1-5 display a default message "invalid entry, try again"

}

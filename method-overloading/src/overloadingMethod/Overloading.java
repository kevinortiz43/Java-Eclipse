package overloadingMethod;

public class Overloading {
	
	static int plusMethod(int x, int y) {
		int sum = x + y;
		System.out.println(plusMethod(8.5,8.5));
//		Inside interger I am  calling same version double version of overloading
		return sum;
		}
	
	static int add(int a, int b) {
		return a + b;
	}
	static double add(double a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b+ c;
	}
	
	static double plusMethod (double x, double y) {
		return x + y;
	}
	
	public static void main (String[] args) {
		
			System.out.println(add(3,5));
			System.out.println(add(32.54,141));
			System.out.println(add(2,4,5));
		
		
		int myNum1 = plusMethod(8,8);
	
		double myNum2 = plusMethod(4.3, 6.01);
		
		System.out.println("int:" + myNum1);
		
		System.out.println("double:" + myNum2);
	
	}
	
	}



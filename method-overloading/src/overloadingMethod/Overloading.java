package overloadingMethod;

public class Overloading {
	
	static int plusMethod(int x, int y) {
		int sum = x + y;
		System.out.println(plusMethod(8.5,8.5));
//		innside interger im calling same version double version of overloading
		return sum;
		
	}
	
	static double plusMethod (double x, double y) {
		return x + y;
	}
	public static void main (String[] args) {
		
		int myNum1 = plusMethod(8,8);
	
		double myNum2 = plusMethod(4.3, 6.01);
		
		System.out.println("int:" + myNum1);
		
		System.out.println("double:" + myNum2);
	
	}
	
	}



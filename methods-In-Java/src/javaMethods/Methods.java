package javaMethods;
import java.util.Scanner;

// static methods
// we are calling call the methods directly static methods 
// static means a current class level scope, static methods

// other scopes are 
//public (when you are using this class  ),
//private , 
//default, 
//protected.
//
// method overloading
//


public class Methods {
	
	static void MyMethod1() {
		
		System.out.println("I just got executed!");
		MyMethod2("From inisde Method1");
	}
	
	static void MyMethod2(String str) {
		
//		taking in input by paramaters
		System.out.println(str);
//		System.out.println("I just got executed again!!");
	}
	
	
public static void main(String[] args) {
	
	MyMethod1();
	MyMethod2("This is method2");
	

	}
}

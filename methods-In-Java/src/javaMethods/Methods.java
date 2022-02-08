package javaMethods;
import java.util.Scanner;

// we are calling call the methods directly static methods 

public class Methods {
	
	static void MyMethod1() {
		
		System.out.println("I just got executed!");
		MyMethod2("From inisde Method1");
	}
	
	static void MyMethod2(String str) {
		System.out.println(str);
//		System.out.println("I just got executed again!!");
	}
	
	
public static void main(String[] args) {
	
	MyMethod1();
	MyMethod2("This is method2");
	

	}
}

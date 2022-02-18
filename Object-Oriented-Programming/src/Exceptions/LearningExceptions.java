package Exceptions;

public class LearningExceptions {

	public static void main(String[] args) {


//		IllegalArgumentException
		
	
		String[] strArray = new String[]{"Hello", "Hi", "Hola"};
//		learning exceptions
		
		String name = "kevin";
	int num = 45;
	
	int result = 0;
	
	String s = "sss";
	
	String word = null;
	
	String[] strArray1 = new String[3];
	
	
	try {
		System.out.println(strArray[4]);
	}
	catch(ArrayIndexOutOfBoundsException aibex){
		System.out.println("This array is too short " +aibex.getMessage());
	}
	
	
	try {
		System.out.println(name.charAt(5));
	}
	
	catch (StringIndexOutOfBoundsException siex){
		System.out.println("Wrong index " + siex.getMessage());
		
	}
	
	try {
		System.out.println(word.length());
	}
	catch(NullPointerException npex){
		System.out.println("Word means nothing " + npex.getMessage());
	}
	
	
	
	try {
		System.out.println("my number is " + Integer.parseInt(s));
	}
	
	catch(NumberFormatException nfex) {
//		nfex is the exception you created
		System.out.println(s + " cannot be converted into a number " + nfex.getMessage() );
	}
	
	catch(Exception ex) {
	System.out.println(ex.getMessage());	
	}
	
	try {
		result = num/0;
	}
	
	catch(ArithmeticException aex) {
		System.out.println("Number cannot be divided by 0" + aex.getMessage());
		
	}System.out.println("the result is " + result);
	
	}

}

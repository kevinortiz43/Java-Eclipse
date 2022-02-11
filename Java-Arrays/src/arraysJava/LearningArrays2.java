package arraysJava;

import java.util.Scanner;

public class LearningArrays2 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5); 
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + ", type of values was " + myIntegers[i] );
		}
		
//		int[] myIntArray =   new int[25];//{1,2,3,4,5,6,7,8,9,10};
//	
//		for(int i=0; i<myIntArray.length; i++) {
//			
//			myIntArray[i] = i*10;
//		}
//		printArray(myIntArray);
//		
//	}
//	public static void printArray(int[] array) {
//		for(int i=0 ; i<array.length ; i++) {
//			System.out.println("element "+ i + ",value " + array[i]);
//		}
//		
	}
	public static int[] getIntegers(int number) {
		System.out.println(" enter " + number + " interger values. ");
		int[] values = new int[number]; 
		
		for(int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		return values;
	}
}

package arraysJava;
import java.util.Scanner;
public class LearningArrays {
	
//	series in memory 
//	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			 
		int num=10;
		
		int[] num1 = new int[] {10,20,30,40,50};
// Initializing at time of declaring, 
	
		int num2[] = new int[10];
//		you can get inputs from user
//		array is empty, it can hold 10 values but its empty
//		you are telling the array can only hold 10 elements
		
		char somecharacter[] = new char[5];
		
		String myStrings[] = new String [5];
		
		String newString[] = new String [5];
		
		String str ="aaa";
		
		
		System.out.println("enter some numbers max of 10");	
		for(int i = 0; i<num2.length; i++) {
//			in arrays the .length is a property of the array
//			if you want to print out the values of an array you have to put it in a loop
			num2[i]= scan.nextInt();
		}
		
		System.out.println("array values are:");
		for (int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		scan.nextLine();
		System.out.println("please enter some names");
		for (int i=0; i<myStrings.length; i++) {
			
					myStrings[i]= scan.nextLine();
		}
		
		
		System.arraycopy(myStrings,2, newString,0,3);
//		array copy take the original array and which location from the source array
//		if you start from second location whatever you have from location in my string and will take from second index copy from
//		second index and to the new index and should be stored in the 0 index in the destination array
//		copy over to 0 index position until the 5 index position
		for (String name : newString) {
			System.out.println(name + " ");
		}
		
	
	}

}

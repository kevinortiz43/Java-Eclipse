package arrayslab;
import java.util.Scanner;
public class ArraysLab1 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
//	1) Display the average of a given integer array 
		double[] IntArray = {10, 10, 20, 30, 40};

		double average=0;
		
		for(int i=0; i<IntArray.length; i++) {
			
			
		average += (IntArray[i]/IntArray.length);
				
		}

		
		System.out.println("Average is " + average);
		
		
		
//  2) Display the number of times a user entered string is found in the given string array. 
		System.out.println("Enter a String either Hello, Hi, Hola");

		String Userinput = scan.nextLine();

		String[] ArrayString =  {"Hello", "Hi", "Hola", "Hello", "Hello", "Hi", "Hola", "Hola", "Hola", "Hola", "Hola", "Hola"};
		
		int counter = 0;
		
		for(int j=0; j<ArrayString.length; j++) {
			
			if(ArrayString[j].equalsIgnoreCase(Userinput)) {
				counter++;
				}
			
		}
		System.out.println(Userinput + " shows up " + counter + " times ");
  

//  3) Copy one array into another (without any built-in method) and display the new array
			
		String[] NewArray = new String [ArrayString.length];
		
		for(int i =0; i<ArrayString.length; i++) {

			
			NewArray[i] = ArrayString[i] ;			
		}
		
			System.out.println(NewArray[0] + NewArray[11]);
		
		
//	4) In a given integer array, look for the user entered number and in which array locations that number was found
//     make an array
//    an integer array, take the user input, which locations that number is found. 
//		Array [2,0,2,1,100,2,-1,-5]
//		user wants to find 2
//		output 2 is found 0, 2, 5 locations
			
			
			System.out.println("Enter a selection 0-10");
			
			int UserInput2 = scan.nextInt();
			
			int[] IntegerArray2 = {0,0,0,0,1,1,1,2,3,4,4,4,4,4,5,5,5,5,5,5,6,6,7,7,8,8,8,8,8,9,9,9,9,9};
			int i=0;
			String output ="";
			for( i=0; i<IntegerArray2.length; i++) {
				
					
				if(IntegerArray2[i]== UserInput2){
						output+=i;			
				}
				
				
			}
			System.out.println(output);
			
			
			
			
			
			
			
	}
}

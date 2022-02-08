package homework;
import java.util.Scanner;
public class HW1Variable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a grade");
		int UserInput = scan.nextInt();

		
		String result=(UserInput >= 90) ? "A" : "F";
		System.out.println(result);
		}

}


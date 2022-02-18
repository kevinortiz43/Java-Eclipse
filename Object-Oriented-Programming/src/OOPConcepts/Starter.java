package OOPConcepts;

import java.util.Scanner;

public class Starter {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		   
		  
		Employee emp1 = new Employee(101, "Tom Smith", 35, 'M', 10456.58, true, "Burgers");
		Employee emp2 = new Employee(102, "Sheena Anderson", 35, 'F', 12455.65, false, "Chicken-Misala");
		Student st1 = new Student(1, "Ray", 45, 'M', 95.00, 88.00, 100.00, false, "Pizza");
		Teacher teacher1 = new Teacher("Mike", 45, 'M', true, 43, 3000.00, "History", "Reuben");
		
		
		
		
		System.out.println("Enter id?");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a name");
		String name = scanner.nextLine();
		System.out.println("Enter an age");
		int age = scanner.nextInt();
		System.out.println("Enter a gender M or F");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter a Salary in Double");
		double salary = scanner.nextDouble();
		System.out.println("Travelling? true or false");
		boolean travelling = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println("favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Enter id?");
		int SId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a name");
		String sName = scanner.nextLine();
		System.out.println("Enter an age");
		int sAge = scanner.nextInt();
		System.out.println("Enter a gender M or F");
		char sGender = scanner.next().charAt(0);
		System.out.println("Enter a Salary in Double");
		double sSalary= scanner.nextDouble();
		System.out.println("Enter the first grade in double");
		double sGrade1 = scanner.nextDouble();
		System.out.println("Enter the second grade in double");
		double sGrade2 = scanner.nextDouble();
		System.out.println("Enter the third grade in double");
		double sGrade3 = scanner.nextDouble();
		System.out.println("Travelling? true or false");
		boolean sTravelling= scanner.nextBoolean();
		scanner.nextLine();
		
		System.out.println("favorite food?");
		String sFood = scanner.nextLine();		
		
		
		Employee emp3 = new Employee(id, name, age, gender, salary, travelling, food);
		System.out.println(emp3.toString());
		
		Student st3 = new Student(sAge, sFood, sAge, sGender, sGrade1, sGrade2, sGrade3, sTravelling, sFood);
		System.out.println(st3.toString());
		
		
//		emp3.display();
//		emp1.display();
//		emp2.display();
//		st1.display();
//		st1.travel();
//		teacher1.display();
//		teacher1.travel();
//		teacher1.favoriteFood();
//		System.out.println(teacher1.toString());
		

		
		

//		    System.out.println("Net Salary for employees" + emp1.calculate(1000));
//			System.out.println();
//			System.out.println();
//			System.out.println();
//		
//		
//			emp2.display();
//		    System.out.println("Net Salary for employees" + emp2.calculate(1200));
//			System.out.println();
//			System.out.println();
//			System.out.println();
//		
			
			Student stud1 = new Student(101, "Mike Miller", 25, 'M', 23.43,34.5,343.0,false, " corn dogs");
			
			double avg= stud1.calculate(3); 
			
//			System.out.println("Average score" + String.format);
			
	}

}

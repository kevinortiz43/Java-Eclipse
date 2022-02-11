package learningOOP;

public class Student {
	
	String StudentID;
	String Fname;
	String Lname;
	String Email;
	double Subject1;
	double Subject2;
	double Subject3;
	static double Average;
	
	public Student(String StudentID, String Fname, String Lname, String Email, double Subject1, double Subject2, double Subject3, double Average) 
	{	
		this.StudentID=StudentID;
		this.Fname = Fname;
		this.Lname = Lname;
		this.Email = Email;
		this.Subject1 = Subject1;
		this.Subject2 = Subject2;
		this.Subject3 = Subject3;
		Student.Average =(Subject1+Subject2+Subject3)/3;
		
	}	
	
	public void Display(Student Students) 
	
	{
		System.out.println("ID: " + Students.StudentID);
		System.out.println("First Name: " +Students.Fname);
		System.out.println("Last Name: " + Students.Lname);
		System.out.println("Email: " + Students.Email);
		System.out.println("First Score: " + Students.Subject1);
		System.out.println("Second Score: " + Students.Subject3);
		System.out.println("Third Score :" + Students.Subject3 );
		System.out.println("Average of Scores: " + Average);
		System.out.println();
		System.out.println();
		
	//		System.out.println("Average of Scores: " + (Students.Subject1+Students.Subject2+Students.Subject3)/3);	
		
		
	}
	
	public static void main(String[] args) {
		
		Student Todd = new Student("001", "Todd", "Hopkins", "Thop@gmail.org", 90.5, 80.0, 70.0,Average);
		
		Student Mario = new Student("002", "Mario", "Wells", "Wario@gmail.org", 80.5, 100.0, 100.0,Average);
		
		Todd.Display(Todd);
		Mario.Display(Mario);
	
	}
	
	
	
	

}

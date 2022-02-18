package OOPConcepts;
public class Student extends Person implements PersonInterface, StudentGraduateInterface{
	int stud_id;
	double subject1,subject2,subject3;
	String major;
	
	Student(int id, String name,int age, char gender,double s1,double s2,double s3, boolean travelling, String food)
	  {
		 
		  super(name,age,gender,travelling, food);
		  
		  this.stud_id=id;
		  this.subject1=s1;
		  this.subject2=s2;
		  this.subject3=s3;
		  
	  } 
	
	
	  
	
	public void Hello()
	    {
	    	System.out.println("Good Morning!!");
	    }
     
	 
	public void display()
	{
		System.out.println(ORGANIZATION);
		System.out.println("Id : "+this.stud_id);
		super.display();
		System.out.println(this.pname);
		System.out.println("Subject1 score : "+this.subject1);
		System.out.println("Subject2 score : "+this.subject2);
		System.out.println("Subject3 score : "+this.subject3);
		
		System.out.println();
		System.out.println();
		
		System.out.println(String.format("%.3f",calculate(3)));
		System.out.println();
		System.out.println(super.calculate(3));
		
		
	}
	
	public double calculate(int totalSubjects) {
		System.out.println("calculate() inside child class");
		double  average= ((this.subject1+this.subject2+this.subject3)/totalSubjects);
		return average;
	}

	public int gradYear(int year) {
		return year;
	}


	@Override
	public int compute(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", subject1=" + subject1 + ", subject2=" + subject2 + ", subject3="
				+ subject3 + ", major=" + major + ", pname=" + pname + ", page=" + page + ", pgender=" + pgender
				+ ", ptravelling=" + ptravelling + ", ffood=" + ffood + "]";
	}
	
	
	
	
	
}
//closing class 'Student'
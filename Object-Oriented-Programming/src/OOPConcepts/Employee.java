package OOPConcepts;

public class Employee extends Person implements PersonInterface, PersonInterface1{
  int emp_id;
  double emp_salary;
  
 
  
  Employee(int id, String name,int age, char gender,double salary, boolean travelling, String food)
  {	 
	 super(name,age,gender,travelling,food);
	 emp_id=id; 
	 emp_salary=salary;
  }
public void display()
{
	System.out.println(ORGANIZATION);
	System.out.println("-------------");
	System.out.println("Id : "+this.emp_id);
	super.display();
	super.travel();
	System.out.println("Salary : "+this.emp_salary);
	System.out.println();
	System.out.println();	
}
 

public String company(String name) {
	return name;
}

public double calculate(int bonus) {
	double  netsalary= bonus+ this.emp_salary;
	return netsalary;
}


public int compute(int num1, int num2)
{
//	try {return num1/0;
//	 return num1/0;
//	}
//	catch(Exception ex) {
//		System.out.println(ex.getMessage());
//	}
//	return num1;
	
	int time= num2-num1;
	return time;
}

void calculate(double n1, double n2)
{
	System.out.println(n1+n2);
}
  
}
package learningOOP;

import java.util.Date;

public class Person1 {
//	Class level variables > Variables that are the same for every objects. they are static variables. 
//	Below are creating a POJO or Java Bean. Using Getter and Setters
	static int count = 0;
	private String pname;
	private int page;
	private char pgender;
	private boolean pwork;
	Date date = new Date();
	Adress addr;
	
	public Person1() {
		addr = new Adress();
		count++;
	} 
	
	
	public boolean isPwork() {
		return pwork;
	}

	public void setPwork(boolean pwork) {
		this.pwork = pwork;
	}

	public String getPname() {
		return pname; 
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public char getPgender() {
		return pgender;
	}
	public void setPgender(char pgender) {
		this.pgender = pgender;
	}
	
	public static void totalPerson() { 
		System.out.println("Total person objects are: " + count);
	}
	


	public static void display(Person1 persons){
		System.out.println("Name: " + persons.getPname());
		System.out.println("Age: " + persons.getPage());
		System.out.println("Gender: " + persons.getPgender());
		System.out.println("Working? " + persons.isPwork());
		System.out.println("Address: " + persons.addr.getCity());
		
		System.out.println();
		System.out.println();
		
	}

	
	
	
	
	

	
//	Get methods are returning the value 
//	Setter is setting the value to the variable 	

	
	

}

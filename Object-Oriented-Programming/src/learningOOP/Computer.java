package learningOOP;

public class Computer {
	
	private String compname;
	private int compyear;
	private double compprice;
	

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public int getCompyear() {
		return compyear;
	}

	public void setCompyear(int compyear) {
		this.compyear = compyear;
	}

	public double getCompprice() {
		return compprice;
	}

	public void setCompprice(double compprice) {
		this.compprice = compprice;
	}
	
	public static void display(Computer computers) {
		System.out.println("Name: " + computers.getCompname());
		System.out.println("Price: " + computers.getCompprice());
		System.out.println("Year: " + computers.getCompyear());
		System.out.println();
		System.out.println();
			
	}	
	
	
	
}

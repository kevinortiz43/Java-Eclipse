package learningOOP;

public class StartingComputer {
	
	public static void main(String[] args) {
		
		Computer c1 = new Computer();		
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();
		
		c1.setCompname("Windows");
		c1.setCompyear(2001);
		c1.setCompprice(500.48);
		
		c2.setCompname("Windows");
		c2.setCompyear(2000);
		c2.setCompprice(300.06);
		
		c3.setCompname("Apple");
		c3.setCompyear(2010);
		c3.setCompprice(1500.95);
		
		c4.setCompname("Alien");
		c4.setCompyear(2019);
		c4.setCompprice(20000.46);
		
		
		Computer.display(c1);
		Computer.display(c2);
		Computer.display(c3);
		Computer.display(c4);
		
	}
	
	
	
	

}

package learningOOP;

public class Starter1 {
	
	public static void main(String[] args) {
//		You are instatiating an object = creating an object 
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		Person1 p3 = new Person1();
		Person1 p4 = new Person1();
	
		 
		p1.setPname("John");
		p1.setPage(33);
		p1.setPgender('M');
		p1.setPwork(true);
		p1.addr.setCity("New York City ");
		

		p2.setPname("Tiffany"); 
		p2.setPage(27);
		p2.setPgender('F');
		p2.setPwork(true);
		p2.addr.setCity("San Diego ");
		
		
		p3.setPname("Mark");
		p3.setPage(20);
		p3.setPgender('M');
		p3.setPwork(false);
		p3.addr.setCity("Austin ");
		
		p4.setPname("Mike");
		p4.setPage(29);
		p4.setPgender('M');
		p4.setPwork(true);
		p4.addr.setCity("Jersey City ");
		
		
		Person1.totalPerson();
		System.out.println();
		Person1.display(p1);
		Person1.display(p2);
		Person1.display(p3);
		Person1.display(p4);
		
		
//		System.out.println(p1.getPname());
//		System.out.println(p1.getPage());
//		System.out.println(p1.getPgender());
//		System.out.println(p1.isPwork());
//		System.out.println();
//		System.out.println();
//		System.out.println(p2.getPname());
//		System.out.println(p2.getPage());
//		System.out.println(p2.getPgender());
//		System.out.println(p2.isPwork());
//		System.out.println();
//		System.out.println();
//		System.out.println(p3.getPname());
//		System.out.println(p3.getPage());
//		System.out.println(p3.getPgender());
//		System.out.println(p3.isPwork());
//		System.out.println();
//		System.out.println();
//		System.out.println(p4.getPname());
//		System.out.println(p4.getPage());
//		System.out.println(p4.getPgender());
//		System.out.println(p4.isPwork());
//		System.out.println();
//		System.out.println();	
//		
		
		
	}

}

package learningOOP;

public class Player {
	String name;
	String sport;
	int keynum;
	String rank;
	boolean active;
	char gender;
	String Lname;
//	static method
	static String Country= "USA";
	int i;
	
	
//	empty constructor
	public Player(){ }
	
//	constructors if you didn't write a constructor the JVM compiler will automatically create 
//	an empty constructor
//	**** interview question, sometimes JVM create empty constructor. 
//	parametize constrcutor
	
	
	public Player (String sport) {
		this.sport = sport;
	};
	
//	creating parametised constructor
	public Player(String name, String sport, int keynum, String rank, boolean active, char gender) 
	{
	this.name = name;
	this.sport = sport;
	this.keynum = keynum;
	this.rank = rank;
	this.active = active;
	this.gender = gender;
	}
	
	
//	defining object methods.
//	any methods that is common to all objects it

	
	
	public void display(Player players)
	{
 	  

	 System.out.println(" Player name is: "  + players.name + " " + players.Lname );
	 System.out.println(" Player rank is: "  + players.rank);
	 System.out.println(" Player active? "  + players.active);
//	 System.out.println("Player counter"  + players.Country);
		System.out.println();
		
	}
	
	public void display() 
	{
	
		System.out.println(" Player name is: "  + name + " " + Lname );
		 System.out.println(" Player rank is: "  + rank);
		 System.out.println(" Player active? "  + active);
//		 System.out.println("Player counter"  + players.Country);
			System.out.println();
		
	}
	
	public void display2 (Player categories) {
		country();
		System.out.println(categories.name + " " + categories.Lname);
		System.out.println("keynum " + categories.keynum);
		System.out.println("Player Sport: " + categories.sport);
		System.out.println();		
	}
	
	
	public static void country()
	{
		System.out.println("Displaying all the players from :" + Country);
		System.out.println();
	}
	
	public void display3(Player player4) 
	{
		System.out.println("sport: "+player4.sport);
		System.out.println("active? "+player4.active);
		System.out.println("position: "+player4.rank);
		System.out.println("gender: "+player4.gender);
		
	}
	
	
           public static void main(String[] args) {      	   
//			Player object data type becuase it has properties and methods
        	   
			Player player1 = new Player();
			Player player2 = new Player();
			Player player3 = new Player();
			
			Player player4 = new Player("Robert" , "Baseball", 99 , "first base" , true , 'M');
			
			player1.name = "Jack";
			player1.sport = "Football";
			player1.keynum = 99;
			player1.rank = "team leader";
			player1.active = false;
			player1.gender = 'M';
			player1.Lname = "Torres";
			
			player2.name = "Sophie";
			player2.sport = "Soccer";
			player2.keynum = 99;
			player2.rank = "Attacker";
			player2.active = true;
			player2.gender = 'F';
			player2.Lname = "Osario";
			
			
			player3.name = "Tim";
			player3.sport = "Swimming";
			player3.keynum = 86;
			player3.rank = "Defender";
			player3.active = false;
			player3.gender = 'M';
			player3.Lname = "Lang";
			
			
			player1.display(player1);
			player2.display(player2);
			player3.display(player3);
			player3.display();
			
			player1.display2(player1);
			
			player4.display3(player4);
			
			
			
		}
}

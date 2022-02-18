package OOPConcepts;

public class Person {
  

static int  count=0;
	
   String pname;
   int page;
   char pgender;
   boolean ptravelling;
   String ffood;
  
    public Person(String name, int age, char gender, boolean travelling, String food) {
		// TODO Auto-generated constructor stub
    	pname=name;
    	page=age;
    	pgender=gender;
    	ptravelling=travelling;
    	ffood = food;
    	count++;
    }

 
    public void favoriteFood() {
    	System.out.println("My favorite food is"  + this.ffood);
    }

    public void Hello()
    {
    	System.out.println("Hello there!!");
    }
    
    
    public void display()
    {
    	System.out.println("Name : "+this.pname);
    	System.out.println("Gender : "+this.pgender);
    	System.out.println("Age : "+this.page);
    	    	
    }
    
   public void travel() {
	   
	   if(ptravelling) {
		   System.out.println("I am travelling");
			System.out.println();
	   }
	   else {
		   System.out.println("I am remote");
			System.out.println();
	   }
   }  
    
    
//   public void display(Person obj)
//    {
//  	System.out.println("within parameterized display...");
//  	System.out.println("Name : "+obj.pname);
//
//    }
    
   double calculate(int num)
    {
    	System.out.println("calculate inside parent class");
    	return 121.33;
    }
    
    public  static  void totalPerson()
    {
    	System.out.println("total person objects are:"+ count);
    }

    
    @Override
   	public String toString() {
   		return "Person [pname=" + pname + ", page=" + page + ", pgender=" + pgender + ", ptravelling=" + ptravelling
   				+ ", ffood=" + ffood + "]";
   	}  

}
	


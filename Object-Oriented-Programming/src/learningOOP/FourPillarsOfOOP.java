package learningOOP;

public class FourPillarsOfOOP {
	
//	Abstraction:
//		Only show the necessary details of the object to the user 
//	    We only care about calling the method not the implementation
	
//	Inheritance
//		Allows you to have code reusability.
//		Parent class, Super class.
//		Sub class, Extended class, Child class.
//  	Add extra properties.
//		
//		Parent class can have many child classes or sub class which are the same thing 
//		it's a one way. Child class receive features from Parent class
//		Parent => Child
//	    Is a relation = similar properties
//		Instance variable = non-static variables are ***declared in a class*** outside any method, constructor or black. 
//		Has a relation = Employee has a address, Football Player has an address, 
//		Complex because address can be break down further
//		Address class is not passing down but it is sharing the properties.
//		Has a relation = Human Lungs, Dog Lungs, Whale Lungs = props: Size, Position in the body, Capacity for oxygen,
	
	
//	Polymorphism 
//		Determine what type of function to run when the program is running
//      Polymorphism in Java is the ability of an object to take many forms. To put it simply,
//	    polymorphism in Java allows us to perform the same action in many different ways.

	
//	Encapsulation
//		Data hiding
//		Restricts access of certain properties of our object
//		You don't want what is calling your object to change the properties of your object
//		Use Getter and Setter methods
	
//	Inheritance 
//	--------------
//	- 1 classes with properties that will be shared amongst different objects
//	- objects - each objects have different properties and some similar properties
//	-  take the class you want to inherit (the child class) from (the parent class) and say extends
//	- ISs
//
//
//	- The child class inherits the properties from the parent class
//
//	create a generic object and then create several variation of objects.
//
//	Interface
//	-------------
//	- taking multiple forms, the classes implmenting that interface are implementing their one meaning in that interface. method interface. Also runtime polymorpshim
//	-Interface is a outline for a class
//	- type interface WaterBottleInterface{
//	//list attributes and things it can do
//
//	such as String color = "Blue"
//
//	void fillUp();
//	}
//
//	public class InterfaceExample implmenets WaterBottleInterface{
//	System.out.println(color);
//	InterfaceExample ex = new InterfceExample();
//	ex.fillup();
//	}
//	add implemented methods below the class 
//	 -above the main method
//
//	Method Overriding
//	----------------------
//	-declaring a method in a sub class 
//	- which is already in the parent class
//	- so the child class can give its own implmentation
//	- polymorsphism type?
//
//	Parent - Animal
//	Child - Dog extedends animals
//	both can speak but;
//	dog goes bark 
//	cat goes meow
//
//	Exception handling
//	----------------------------
//	An exception is an event, which occurs during the exeecution of a program,
//	that disrupts the normal flow of the programs instrctuions when an error occurs within a method.
//	the method is what determines the behavior in Java.
//	everything in java is written in methods
//	Methods creates exception objects and hands it off to runtime system (JVM)
//	
//	Two types of exceptions: User-Defined Exceptions || Built-in Exceptions
//	
//	Built in Exceptions: Checked Exceptions || Unchecked Exceptions 
//	
//	Checked exceptions Compiled exceptions
//	Unchecked: Runtime exceptions
//	
//	catch(ArithmeticException){
//	}
//
//	catch(InputMismatchException e){
//	}
//	catch(Exception e){
//	sysout(something went wrong)
//	}
//
//	finally{
//	scanner.close
//	input / output streams needs to be closed
//	
//	}
//
//	Runtime Polymorsphism
//	----------------------------
//	Will control what methods will run prioritizing over the other ones
//
//	Abstraction
//	-----------------
//	no implementation
//	parent class child extends all the methods and its the child class responsibility to give the abstract methods
//	a purpose. an abstract class can never instatiate the methods.
	
	
	
	
	

}

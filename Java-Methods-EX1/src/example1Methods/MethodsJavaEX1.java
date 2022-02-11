package example1Methods;

public class MethodsJavaEX1 {
	
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted =5;
		int bonus = 100; 

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final Score was " + finalScore);
		}
	}

	public static void calculateScore() {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted =5;
		int bonus = 100; 
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore +=1000;
			System.out.println("your Final score was " + finalScore);
		}
		
		
	}
}

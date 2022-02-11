package arraysJava;

public class StringToCharacterArr {
	
	
	public static void main(String[] args) {
		
		
		char somecharacters[] = {'k','e','v', 'i', 'n'};
		
		String str = new String(somecharacters);
		System.out.println(str);
	
 		char newCharArr[] = str.toCharArray();
		int l = newCharArr.length;
 		System.out.println("length of string "+newCharArr.length);
		
		for(int i=0; i<l; i++) {
			System.out.print(newCharArr[i]);
			
		}
	}

}

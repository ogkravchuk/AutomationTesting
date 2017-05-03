package pre_intermediate;

public class Task14 {

	public void diagonalPrint(String text) {
		for (int i = 1; i <= text.length();i++){
			for (int j = 0; j <= i-1;j++)
			System.out.print(" ");
			System.out.println(text.substring(i-1, i));
		}
		
	}
	
	public static void main(String[] args) {
		//Data
		String a="Fire in a hall";
		System.out.println("Write a method which takes a word and prints it like a diagonal matrix.");
		System.out.println("The word or sentence is : "+a);
		//New class
		Task14 Fourteen = new Task14();
		//Method application
		Fourteen.diagonalPrint(a);

	}


}
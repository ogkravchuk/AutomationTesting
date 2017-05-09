package Intermediate;

public class Task8 {
	public void camelCaseSeparator(String camelString) {
		String wordsInString[] = camelString.split("(?=\\p{Upper})");
		System.out.print(wordsInString[0].substring(0, 1).toUpperCase() + wordsInString[0].substring(1) + " ");
		for (int i = 1; i <= wordsInString.length - 1; i++)
			System.out.print(wordsInString[i].substring(0, 1).toLowerCase() + wordsInString[i].substring(1) + " ");
	}

	public static void main(String[] args) {
		//Data
		System.out.println("Some testing frameworks can read names of test methods and include them to the report like a beautiful sentence.​\n"
				+ "As you know, we use camelCaseNamingPolicy during writing our tests. Please write a method which takes a test name and returns beautiful sentence for report. ");
		String a="checkChangingProfilePicture";
		System.out.println("My sentence is: "+a);
		//new class
		Task8 Eight = new Task8();
		//Method application
		System.out.print("Result is :");
		Eight.camelCaseSeparator(a);
	}
}


package Intermediate;

public class Task6 {
	public void longestWordInString(String myString) {
		
		String wordsInString[] = myString.split(" ");
		int result = 0;
		int tempResult = 0;
		String resultWord = "";
		for (String i : wordsInString) {
			tempResult = i.length();
			if (tempResult > result) {
				result = tempResult;
				resultWord = i;
			}
		}
		System.out.println("The longest word in string is '" + resultWord + "'and containing " + result + " characters");
	}

	public static void main(String[] args) {
		//New class
		Task6 Six = new Task6();
		//Data
		System.out.println("The longest word. Write a method which returns the longest word in the input string. Compare only letters separated by space symbol ");
		String a="Relax and don't do it";
		System.out.println("String is: "+a);
		//Method application
		Six.longestWordInString(a);
	}

}



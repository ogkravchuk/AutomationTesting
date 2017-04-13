package pre_intermediate;

public class Task2 {
		public String swapChar(String word){			
			String newWord = word.substring(word.length()-1)+ word.substring(1,word.length() - 1)+ word.substring(0,1);		
			return newWord;
		}
		public void newSwapChar(String word) {
			System.out.print(word.split("")[word.length()-1]);
			for (int i = 1; i <= word.length()-2; i++) {
				System.out.print(word.split("")[i]);
				}
			System.out.print(word.split("")[0]);

		}
		public static void main(String[] args) {
			String word = "Go play";
			Task2 Two = new Task2();							
			System.out.println("The word which need to swap is: " + word);
			System.out.println("Result of swaping is: " + Two.swapChar(word));
			System.out.println("Another methot:");
			Two.newSwapChar("movie");
		}

}

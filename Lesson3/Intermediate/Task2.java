package Intermediate;

public class Task2 {
	
	int count, sum, number;

	
	public int checkSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
		}
	
	public void countOfTickets(){
		
		int count = 0; 
		for (int i = 1; i <= 999; i++){
			for (int j = 0; j <= 999; j++) {
			if (checkSum(i) == checkSum(j)){
				count++;
			} 					
			}
		}
		System.out.println("Quantity of lucky tickets: " + count);
	}

	public static void main(String[] args) {
		//Data
		System.out.println("Write a program for calculating of how many lucky tickets people can find in the one roll");
		//New class
		Task2 Two = new Task2();
		
		//Method application
		Two.countOfTickets();
	}
}


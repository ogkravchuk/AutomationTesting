package Intermediate;
import java.util.Scanner;

public class Task1 {

	public int getDigitSum() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = reader.nextInt();
		int result = 0;

		for (int i = 0; i <= a; i++) {
			result += a%10;
			a/=10;
		}
		if (a<0){
			System.out.println("Number must be more than 0");
			System.exit(0);
		}
		return result;
	}

	public static void main(String[] args) {
		//New Class
		Task1 One = new Task1();
		//Method application
		System.out.println("Result is :"+One.getDigitSum());

	}

}
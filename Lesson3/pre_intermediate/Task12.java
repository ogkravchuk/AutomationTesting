package pre_intermediate;

public class Task12 {

	public int getSum (int a) {
		int result = 0;

		for (int i = 0; i <= a; i++) {
			result += a%10;
			a/=10;
		}
		return result;
	}

		public static void main(String[] args) {
			//Data
			int a=645656545;
			//Create class
			Task12 Twelve = new Task12();
			System.out.println("Imagine that you have a special skill which allows to calculate amount of digits in any integer positive number.");
			System.out.println("Write a method which checks your superpower for any hard-coded number. ");
			//Method application		
			System.out.println("The number is "+a+".");
			System.out.println("Amount of digits is "+Twelve.getSum(a)+".");

		}

	}

package pre_intermediate;

public class Task8 {
	private  int [] array = new int [100];
	public double fibo () {
		array [0] = 0;
		array [1] = 1;
		int sum = 0;
		for (int i = 2; i <= 11; i++) {
			array[i] = array[i-1] + array[i-2];


			if (array[i]%2 == 0) {

				sum += array[i];

			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		//Create class
		Task8 Eight = new Task8();
		System.out.println("Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence.");
		//Methods application
		System.out.println("The sum is: " +Eight.fibo());


	}

}
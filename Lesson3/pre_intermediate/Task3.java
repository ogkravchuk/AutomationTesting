package pre_intermediate;

import beginner.Task2;

public class Task3 {
	//New method
	public boolean checkNumbers(int a, int b){
		boolean result=false;
		if ((a==21 ||b==21||a+b==21))
			result=true;
		System.out.println("First number is "+a+" and second number is "+b);
		
		return result;

		}
		public static void main(String[] args){
		//Data of new Arrays
		int[][] numbers = {{23, -2}, {0, 21}, {21, 0}, {5, 6}, {-10, -11}, {-21, 21} };
		//Create class
		Task3 Three=new Task3();
		//Print condition
		System.out.println("Given two integers, a and b.\n"
				+ "Create a method (program) which returns True if one if them is 21 or if their sum is 21");
		System.out.println();
		//Methods application
		for(int[] newTwo: numbers)
		{
			System.out.println("Numbers " + newTwo[0] + " and " + newTwo[1] + " result is " 
		+ Three.checkNumbers(newTwo[0], newTwo[1]));
			System.out.println();
		
		}		
		if (numbers.length==0 )
			System.out.println("No data");
		}
}

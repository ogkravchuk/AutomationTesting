package pre_intermediate;

import beginner.Task2;

public class Task3 {
	public boolean checkNumbers(int a, int b){
		boolean result=false;
		if ((a==21 ||b==21||a+b==21))
			result=true;
		return result;
		}
		public static void main(String[] args){
		int[][] numbers = {{11,31}, {110,21},{8,10},{4,3}};
		Task3 Three=new Task3();
		System.out.println("Given two integers, a and b.\n "
				+ "Create a method (program) which returns True if one if them is 21 or if their sum is 21");
		for(int[] newTwo: numbers)
		{
			System.out.println("Numbers " + newTwo[0] + " and " + newTwo[1] + " result is " 
		+ Three.checkNumbers(newTwo[0], newTwo[1]));
		}		
	}
}

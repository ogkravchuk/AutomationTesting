package beginner;

public class Task2 {

public boolean checkNumbers(int a, int b){
	boolean result=false;
	if ((a==10 ||b==10||a+b==10))
		result=true;
	return result;
	}
	public static void main(String[] args){
	int[][] numbers = {{11,31}, {110,21},{8,10},{4,3}};
	Task2 Two=new Task2();
	System.out.println("Given two integers, x and y.\n "
			+ "Create a method (program) which returns True if one if them is 10 or if their sum is 10");
	for(int[] newTwo: numbers)
	{
		System.out.println("Numbers " + newTwo[0] + " and " + newTwo[1] + " result is " 
	+ Two.checkNumbers(newTwo[0], newTwo[1]));
	}		
}}
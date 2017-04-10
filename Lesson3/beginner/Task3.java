package beginner;

public class Task3 {
	
	public boolean checkNumbers(int a){
		boolean result=false;
		if ((a>=0)&&((a%3==0)||(a%5==0)))
			result=true;
		return result;
	}
	
	public static void main(String[] args){
		int[] numbers = new int[]{1,2,3,4,5};
		System.out.println("Create a method (program) which returns True if the given non-negative number is a multiple of 3 or a multiple of 5.");
		Task3 Three=new Task3();
		for(int b: numbers)
			System.out.println("For number " + b + " result is " + Three.checkNumbers(b));
				
		}

}

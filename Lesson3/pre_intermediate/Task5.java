package pre_intermediate;

public class Task5 {

	public boolean show7and5 (int[] myArray) {
		boolean result = true;
		
		for (int i:myArray) {
			if (i == 7 || i == 9)
				result = false;
	}
		return result;
	}
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,100,121};
		int[] myArray2 = {1,2,3,4,6,8,100,121};
		Task5 Five = new Task5();
		System.out.println("Method which checks input array and returns True if the array doesn't contain your unloved numbers 7 and 9.");

		System.out.println("For first array is " +Five.show7and5(myArray));
		System.out.println("For second array is "+Five.show7and5(myArray2));

	}

}
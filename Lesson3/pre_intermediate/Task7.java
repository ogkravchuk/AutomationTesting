package pre_intermediate;

public class Task7 {

	

	
	public int min (int[] myArray) {
		int min = myArray[0];
		for (int i:myArray) if (min > i) min = i;
		return min;
	}
	
	public int max (int[] myArray) {
		int max = myArray[0];
		for (int i:myArray) if (max < i) max = i;
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,3,4,5,6,7,9,12,-55};
		Task7 Seven = new Task7();

		System.out.println(Seven.min(myArray));
		System.out.println(Seven.max(myArray));
	}

}
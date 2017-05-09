package pre_intermediate;

public class Task7 {

	public int min (int[] myArray) {
		int min = myArray[0];
		for (int i:myArray)
			if (min > i) 
				min = i;
		return min*2;
	}
	
	public int max (int[] myArray) {
		int max = myArray[0];
		for (int i:myArray) 
			if (max < i) 
				max = i;
		return max*2;
	}
	static void PrintResult(int[] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.print(+x[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Data
		int[] myArray = {1,2,3,3,4,5,6,7,9,12,-55};
		//Create class
		Task7 Seven = new Task7();
		//Methods application
		System.out.println("Given an array of integers. Write a method which finds max and min elements in it and multiplies them by 2.");
		System.out.print("Elements of array are: ");
		Seven.PrintResult(myArray);
		System.out.println("Min element of array that multiplies by 2 is "+Seven.min(myArray));
		System.out.println("Max element of array that multiplies by 2 is "+Seven.max(myArray));
	}

}
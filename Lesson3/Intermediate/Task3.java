package Intermediate;

import java.util.Arrays;

public class Task3 {
	public static int[] reverseInPlace(int[] x) {

	    int tmp;    
	      System.out.println("Array before reversing: " + Arrays.toString(x));
	    for (int i = 0; i < x.length / 2; i++) {

	        tmp = x[i];
	        x[i] = x[x.length - 1 - i];
	        x[x.length - 1 - i] = tmp;
	    }
	    if (x.length<1){
	    	System.out.println("No arrays");

	    }

	    return x; 
	}
	static void PrintResult(int[] x) 
	{
		System.out.print("Array after reversing: ");
		for (int i = 0; i < x.length; i++) 
		{
			System.out.print(+x[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Data
		int[] x={1,2,3,4,5,6};
		System.out.println("Write a method which takes an array and returns inverted one");

		//Create class
		Task3 Three = new Task3();
		
		//Method application
		
		Three.reverseInPlace(x);
		Three.PrintResult(x);

	}
}

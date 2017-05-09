package Intermediate;

import java.util.Arrays;

public class Task3 {
	public static int[] reverseInPlace(int[] x) {

	    int tmp;    

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
	static void PrintResult(int[] x) {

		for (int i = 0; i < x.length; i++) {
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
		System.out.println("Array before invert:" );
		Three.PrintResult(x);
		Three.reverseInPlace(x);
		System.out.println("Array after invert:" );
		Three.PrintResult(x);

	}
}

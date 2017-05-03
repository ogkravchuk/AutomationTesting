package pre_intermediate;

public class Task11{

	public boolean arraySequence(int[] myArray){
		boolean a = false;
		for(int i = 0; i < myArray.length-2; i++)
		{
			if((myArray[i] == 1) && (myArray[i+1] == 2) && (myArray[i+2] == 3))
				a = true;							
		}
		return a;
	}	

public static void main(String[] args) {
	//Data		
	int[] testArray = {1,2,3,3,2,1,12,32,12};
	//Create class
	Task11 Eleven = new Task11();
	System.out.println( "Given an array of integer positive numbers. For example, {4, 6, 0, 1, 2, 3, 1, 9}, but it can be any\n"+
			"random. Write Java-program which returns True, if sequence {1, 2, 3} appears somewhere in the"+
			"array. Provide additional boundary checks");
	//Method application		
	System.out.println("The array has sequence 1 2 3 - " + Eleven.arraySequence(testArray));
	}
}
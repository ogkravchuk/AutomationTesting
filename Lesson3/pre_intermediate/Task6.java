package pre_intermediate;

public class Task6 {

	public int summ (int[] myArray) {
		int sum = 0;
		
		for (int i:myArray)
			sum +=i;
		if (myArray.length==0)
		System.out.println("No data.");
		else;

		return sum;

		}
	
	public int avg (int[] myArray) {
		

		int avg=0;
        for (int i:myArray)
        	avg = summ(myArray) / myArray.length;
		if (myArray.length==0)
			System.out.println("Thats bad");
	
			//System.out.println("The sum of array elements is:" +summ(myArray)+"\n"+
			//"The arithmetical average of array elements is:"+avg);

		return avg;

	}
	static void PrintResult(int[] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.print(+x[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Data
		int[] myArray = {1,2,3,2,5,6};
		//Create class
		Task6 Six = new Task6();
		System.out.println("Given an array of integers. Write a method which calculates sum of all elements and arithmetic average of them." );
		//Methods application
		System.out.print("Elements of array are:");
		Six.PrintResult(myArray);
		System.out.println("The sum of array elements is: "+Six.summ(myArray));
		System.out.println("The arithmetical average of array elements is: "+Six.avg(myArray));
		//Six.summ(myArray);
		//Six.avg(myArray);
	}

}
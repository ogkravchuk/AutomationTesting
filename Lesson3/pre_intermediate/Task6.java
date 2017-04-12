package pre_intermediate;

public class Task6 {

	public int summ (int[] myArray) {
		int sum = 0;
		
		for (int i:myArray)
			sum +=i;
		return sum;
	}
	
	public int avg (int[] myArray) {
        int avg = summ(myArray) / myArray.length;
		
		return avg;
		}
		
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7};
		Task6 Six = new Task6();
		System.out.println("The sum of array elements is: "+Six.summ(myArray));
		System.out.println("The arithmetical average of array elements is: "+Six.avg(myArray));

	}

}
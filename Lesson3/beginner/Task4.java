package beginner;

public class Task4 {

	public void numberQuantity(int[] arrays, int[] numbers) {
		int quantity;
		System.out.print("Initial array is " );
		showArray(arrays);
		System.out.print("Numbers which we will search in array are ");
		showArray(numbers);
		for(int number: numbers){
			quantity=0;
			for(int array:arrays){
				if(array == number)quantity++;
			}
			System.out.println("Quantity of number " + number + " is " + quantity);
			}
	}
	private void showArray(int[] a){
		for(int number: a)
			System.out.print(number + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arrays = {1,1,1,2,3,4,5,6,7,8,9,0,0,2,5,1,2,3,5,7,8,9,0,4,3,2,2};
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		Task4 Four = new Task4();
		Four.numberQuantity(arrays,numbers);

	}

}
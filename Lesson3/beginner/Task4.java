package begginer;

public class Task4 {

	static int a;

	public Task4(int a) {
	this.a = a;
}

	public int numberQuantity(int[] array, int a) {
		int x = 0;
		for (int i : array) {
			if (i == a)
				x++;
		}
		return x;
	}

	public static void main(String[] args) {
		Task4 instatnse = new Task4(0);
		int [] myArray = {1,1,2,5,6,7,5,9,0,4,4,3,4};
		System.out.println(instatnse.numberQuantity(myArray, a));
		System.out.println(instatnse.numberQuantity(myArray, a+1));

	}

}
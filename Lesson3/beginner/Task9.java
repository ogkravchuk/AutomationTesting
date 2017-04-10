package beginner;

public class Task9 {

	public void division (int a, int b) {
		double div = ((double) a)/((double) b);
		System.out.println(div);
	}

	public static void main(String[] args) {
		int[][] array = {{5,1}, {9,9}, {88,2}, {20,10}, {31,10}, {-45,-21}, {9,94}, {-2,31}};
		Task9 Nine = new Task9();
		for (int[] x:array)
		Nine.division(x[0], x[1]);
	}
}

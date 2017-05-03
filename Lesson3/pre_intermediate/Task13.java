package pre_intermediate;

public class Task13 {                                   

	public void calculateQuadraticEquation(int a, int b, int c){
		double disc = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Discriminant = " + disc);
		double x1, x2;
			if(disc < 0){
				System.out.println("Discriminant < 0, the equation has no solusion.");
			}
			else if(disc == 0){
				System.out.println("Discriminant = 0, the equation has one real root.");
				x1 = x2 = -(b / (2 * a));
				System.out.println("x1 = x2 = " + x1);
			}
			else  // (Disc > 0)
				{
				System.out.println("Discriminant > 0, the equation has two real root.");
				x1 = (-b - Math.sqrt(disc)) / (2 * a);
				x2 = (-b + Math.sqrt(disc)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
	}
	public static void main(String[] args) {
		//Data
		int a = 2;
		int b = 4;
		int c = 2;
		System.out.println("Write a method for calculating quadratic equation. It takes a, b, c numbers and print the solution ");
		//New class
		Task13 Thirteen = new Task13();
		//Method application
		System.out.println("There is quadratic equation ax2 + bx + c = 0");
		System.out.println("If a = " + a + ", b = " + b + " and c = " + c + ", so");
		Thirteen.calculateQuadraticEquation(a, b, c);		
		
	}
}

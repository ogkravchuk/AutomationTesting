package beginner;

public class Task6 {
public void allEvenOne () {
	int i = 2;
	while(i<=50) {
		System.out.print(i+" ");
		i+=2;
	}
	System.out.println();
}

public void allEvenTwo () {
		for(int i = 2; i<= 50;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}	

	public static void main(String[] args) {
	Task6 One = new Task6();
	System.out.println("Print all even numbers from range (0..50).");
	System.out.println("Way one:");
	One.allEvenOne();
	System.out.println("Way two:");
	One.allEvenTwo();
	}
}
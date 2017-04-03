package begginer;

public class Task6 {
public void allEvenOne () {
	int i = 2;
	while(i<=50) {
		System.out.print(i+" ");
		i+=2;
	}
}
public void allEvenTwo () {
		for(int i = 2; i<= 50;i+=2) {
			System.out.print(i+" ");
		}
	}	

	public static void main(String[] args) {
	Task6 One = new Task6();
	One.allEvenOne();
	System.out.println();
	One.allEvenTwo();
	}
}
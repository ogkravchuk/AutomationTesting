package begginer;

public class Task2 {
	static int a;
	static int b;


public Task2(int a, int b) {
		this.a = a;
		this.b = b;
	}

public boolean checkNumbers(int a, int b){
	boolean result=false;
	if ((a==10 ||b==10||a+b==10))
		result=true;
	return result;
	}
	public static void main(String[] args){
	Task2 Two=new Task2(3, 8);
	System.out.println(Two.checkNumbers(a, b));
	
	}
}
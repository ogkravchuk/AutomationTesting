package begginer;

public class Task2 {
	static int a;
	static int b;


public Task2(int a, int b) {
		this.a = a;
		this.b = b;
	}

public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

public boolean checkNumbers(int a, int b){
	boolean result=false;
	if ((a==10 ||b==10| a+b==10))
		result=true;
	return result;
	}
	public static void main(String[] args){
	Task2 One=new Task2(10, 10);
	System.out.println(One.checkNumbers(a, b));
	
	}
}
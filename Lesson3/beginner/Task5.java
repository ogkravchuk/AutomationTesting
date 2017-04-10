package beginner;

public class Task5 {

public String returnResult (int x) {
	String[] name = {"Failed","Bad","Not bad","Good","Excellent"};

	return name[x];
}   


	public static void main(String[] args) {
	Task5 NewMark = new Task5();

	for(int i = 0; i<=4;i++) {
	System.out.println("The mark "+(i+1)+" is "+NewMark.returnResult(i));
	}

	}

}
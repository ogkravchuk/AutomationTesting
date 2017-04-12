package beginner;

public class Task5 {

	public void returnResult (int[] x) {
	String name;
	
	for (int mark : x) {
	switch (mark) {
	default: 
		name = "Invalid mark";
		break;
	case 1:
		name = "Very bed";
		break;
	case 2:
		name = "Bed";
		break;
	case 3:
		name = "Not bed";
		break;
	case 4:
		name = "Good";
		break;
	case 5:
		name = "Perfect";
		break;
	}
	System.out.println("Name for mark " + mark + " is " + name);	
	}
}

public static void main(String[] args) {

	int[] marks = {6,5,4,3,2,1,0 };
	Task5 Five= new Task5();
	Five.returnResult(marks);
	
	}
}
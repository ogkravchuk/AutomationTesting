package pre_intermediate;

public class Task1{
	private boolean cinema(boolean heSmile, boolean sheSmile) {		
		boolean x = false;
		if((heSmile == true && sheSmile == true) || (heSmile == false && sheSmile == false) )
			x = true;
		return x;				
	}

	public static void main(String[] args) {
		//Data
		boolean heSmile = true;
		boolean sheSmile = true;
		//Create class
		Task1 goToCinema = new Task1();
		System.out.println("Write a method which returns True if they're eventually going to go to the cinema, of False otherwise");
		//Print data
		System.out.println("What mood he has? - " + heSmile);
		System.out.println("What mood she has? - " + sheSmile);
		//Methods application
		System.out.println("Do they visit the cinema? - " + goToCinema.cinema(heSmile, sheSmile));
	}
}
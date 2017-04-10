package pre_intermediate;

public class Task1{
	private boolean cinema(boolean heSmile, boolean sheSmile) {		
		boolean x = false;
		if((heSmile == true && sheSmile == true) || (heSmile == false && sheSmile == false) )
			x = true;
		return x;				
	}

	public static void main(String[] args) {
		boolean heSmile = true;
		boolean sheSmile = true;
		Task1 goToCinema = new Task1();
		System.out.println("What mood he has? - " + heSmile);
		System.out.println("What mood she has? - " + sheSmile);
		System.out.println("Do they visit the cinema? - " + goToCinema.cinema(heSmile, sheSmile));
	}
}
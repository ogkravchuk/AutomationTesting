package Intermediate;


import java.util.Scanner;

public class Task5 {

		public void tempConvert() {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter temperature : ");
			double a = reader.nextInt();
			Scanner reader1 = new Scanner(System.in);
			System.out.println("Is it Celsiy? yes/no");
			String b = reader1.next();
			if (b.equalsIgnoreCase("yes")){
				System.out.println("If temperature in Celsius is: "+a);
				a=a+273.15;
				System.out.println("The temperature in Kelvin is: "+a);
			}
			
			else if (b.equalsIgnoreCase("no")){
					System.out.println("If temperature in Kelvin is: "+a);
					a=a-273.15;
					System.out.println("The temperature in Celsius is: "+a);
				}
				else{
			           System.out.println("write plz yes or no");
			    }
		
		}

	public static void main(String[] args) {
		//New Class
		Task5 Five = new Task5();	
		//Method application
		//Five.tempConvert();
		Five.tempConvert();
	}
}

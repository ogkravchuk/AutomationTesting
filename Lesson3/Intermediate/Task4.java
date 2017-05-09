package Intermediate;



public class Task4 {
	
	public int sumFromString(String s){

	       int sum = 0;
	        for(int i = 0; i < s.length() ; i++){
	            if( Character.isDigit(s.charAt(i)) ){
	                sum = sum + Character.getNumericValue(s.charAt(i));
	            }
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		//Data
		String s=("a1b2c3d4");
		System.out.println("Given a string. Write a method which returns the sum of the numbers appearing in the string, ignoring all other characters. Provide all necessary checks.");
		//Create class
		Task4 Four = new Task4();
		//Method application
		System.out.println("Strint is :" + s);
		System.out.println(	"The sum of the numbers appearing in the string is: "+ Four.sumFromString(s));


	}
}

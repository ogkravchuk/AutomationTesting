package pre_intermediate;

public class Task9 
{
	public void multiplicationTable (int[] a){

			for(int i = 0; i <= a.length-1; i++){
				
				System.out.println("Multiplication table for " + a[i]+" is :");
				for(int b = 0; b <= 10; b++){
					
					int multiplicationResult = a[i] * b;
					System.out.println(a[i] + " * " + b + " = " + multiplicationResult);
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) 
	{
		//Data
		int[] one = {1, 2, 3, 4, 5, -999};
		//Create class
		Task9 Nine = new Task9();
		//Method application
		Nine.multiplicationTable(one);			
	}	
}
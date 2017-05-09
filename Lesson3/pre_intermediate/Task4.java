package pre_intermediate;

public class Task4 {
			
		public void half(String[] myArray){
			
			for(int i = myArray.length/2; i < myArray.length; i++)
				{				
					System.out.print(myArray[i]+" ");
				}
			if (myArray.length==0)
				System.out.print("No data");
			}	
		static void PrintResult(int[] x) {

			for (int i = 0; i < x.length; i++) {
				System.out.print(+x[i]+" ");
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			//Data
			
			String[] x = {"1","2","3","4","5","6","7"};
			//Create class

			Task4 Four = new Task4();
			System.out.println("Given an array of integers."+" Write a method which prints the second half of the array. Include the middle element to output,\n"
					+"if the array has odd number of elements.");
			//Methods application
			System.out.print("The second half of the array is: ");
			Four.half(x);
		}
	}

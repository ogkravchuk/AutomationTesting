package pre_intermediate;

public class Task4 {
			
		public void half(int[] myArray){
			
			for(int i = myArray.length/2; i < myArray.length; i++)
				{				
					System.out.print(myArray[i]+" ");
				}
		}	
		
		public static void main(String[] args) {
			
			int[] array = {1,2,3};

			Task4 Four = new Task4();

			System.out.print("The second half of the array is ");
			Four.half(array);
		}
	}

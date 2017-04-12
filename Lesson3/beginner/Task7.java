package beginner;

public class Task7 {
	
	public int maxElement (int[] newArray) {
		int max=newArray[0];
		for (int i = 0; i < newArray.length; i++){
			if (max < newArray[i]) 
			{
		        max = newArray[i];
		    }
		}
		return max;
		
	}
	public static void main(String[] args){		
	Task7 One = new Task7();
	int [] newArray = {-111,-55,-65};

	System.out.println("Max element of array is the " + One.maxElement(newArray));

		}
	}
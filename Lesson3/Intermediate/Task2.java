package Intermediate;

public class Task2 {

	public void checkSum() {
		int count=0;
		
		int a0, a1, a2, a3, a4, a5;
		for (a0=0; a0<=9; a0++)
		{
			for (a1=0; a1<=9; a1++)
			{
				for (a2=0; a2<=9; a2++)
				{
					for (a3=0; a3<=9; a3++)
					{
						for (a4=0; a4<=9; a4++)
						{
							for (a5=0; a5<=9; a5++)
							{
								if ((a0+a1+a2)==(a3+a4+a5))
									count=count+1;
							}
						}
					}
				}
			}
		}
		System.out.println("People can find in the one roll​ are "+count+" lucky tickets");
	}

	public static void main(String[] args) {
		//Data
		System.out.println("Write a program for calculating of how many lucky tickets people can find in the one roll");
		//New class
		Task2 Two = new Task2();
		//Method application
		Two.checkSum();
	}
}


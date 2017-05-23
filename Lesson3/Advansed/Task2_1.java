package Advansed;

import java.util.Scanner;

public class Task2_1 {


	private static int[] numbers = { 1000,  900,  500,  400,  100,   90,  
            50,   40,   10,    9,    5,    4,    1 };
         
	private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
          "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
	String roman = "";  
	int N= 0 ;
public void Scan(){

	System.out.print("Enter the number in range 1 to 2015: ");
	Scanner scan = new Scanner(System.in);
	if(scan.hasNextInt())		
		N = scan.nextInt();	
	else
		System.out.println("ERROR! Please do not use letters and/or special symbols.");		
  //  if((N>2015) ||(N<0));
  //  System.out.println("Enter the number in range 1 to 2015: ");
}
	
public String logic() {
   
 for (int i = 0; i < numbers.length; i++) {
    while (N >= numbers[i]) {
       roman += letters[i];
       N -= numbers[i];
    }

 }
 
 return roman;
}

	public static void main(String[] args)
	{
		Task2_1 Two = new Task2_1();
		Two.Scan();
		//Two.logic();		
		System.out.println("Roman number is: " + Two.logic());	
	}
}

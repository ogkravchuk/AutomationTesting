package Advansed;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 

{
	String passwordTemplate="";
	private String generatePasswordTemplate(int passwordLength)
	{		
		
		do			
		{
			
			Random random = new Random();
			for(int i = 1; i <=passwordLength; i++ )
			{
			switch (random.nextInt(3)) 
				{
				case 0:
					passwordTemplate += "B";
					break;
				case 1:
					passwordTemplate += "S";
					break;
				case 2:
					passwordTemplate += "N";
					break;			
				}			
			}
			//System.out.println(passwordTemplate);
		} 
		
		while(checkTemplate(passwordTemplate) == false);		
		return passwordTemplate; 
	}
	
	public String generatePass()
	{

		String myPassword= "";
		Random random = new Random();
		String passLetter = "";
		for(int i = 1; i <=passwordTemplate.length(); i++ )
		{
			passLetter = passwordTemplate.substring(i-1, i);
			switch (passLetter) 
			{
			case "S":
				myPassword += String.valueOf(random.nextInt(10));
				break;
			case "N":
				passwordTemplate += "S";
				break;
			case "B":
				passwordTemplate += "N";
				break;			
			}
					}
		return myPassword;
	}
		private boolean checkTemplate(String passwordTemplate) {
			
			
		Pattern p = Pattern.compile("(.*[S].*)(.*[B].*)(.*[N].*)"); 
		Matcher m = p.matcher(passwordTemplate);		
		boolean ft = m.matches();		
		return ft;		
	}
	public static void main(String[] args) 
	{
		Task1 task1 = new Task1();
		int passwordLength=1;
		System.out.println(task1.generatePasswordTemplate(passwordLength));
		System.out.println(task1.generatePass());
			
	}

}
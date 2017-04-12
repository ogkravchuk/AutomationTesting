package beginner;

public class Task8 {

	public static String printCharacters(String a1,int n1) {

	    char[] s2=a1.toCharArray();
		a1="";
	    for(int i=0;i<s2.length;i++){
		    for(int j=0;j<n1;j++){
		    	a1+=s2[j];
		    }
		    n1-=1;
	    }
	    return a1;
	}
	public static void main(String[] args){
		System.out.println("Given a string and an int n. Return a string made of the first n characters of the string, "
				+ "followed by the first n-1 characters of the string, and so on.");
		String s="Testing";
		System.out.println("String is "+s+".");
		int n = 6;
		System.out.println("First characters is "+n+".");
		System.out.println("Result is "+printCharacters(s, n));
	}
}
package Advansed;

import java.util.Random;

public class Task1_1 {

	
    public static String genPass(int leng) {
        String pass  = ""; 
        Random arr = new Random(); 
        int string = leng + arr.nextInt(leng); 
        for (int i = 0; i < string; i++) { 
            char value = 0; 
            int quontOfVal = 15; 
            
            switch(arr.nextInt(3)) { 
                case 0: {value = '0'; quontOfVal = 10;} 
                     break;
                case 1: {value = 'a'; quontOfVal = 26;} 
                     break;
                case 2: {value = 'A'; quontOfVal = 26;} 
                     break;
            }
            pass += (char)((arr.nextInt(quontOfVal)) + value); 
        }
        return pass;
    }
    
    public static void main(String argv[]) {
        String pass = genPass(10); 
        System.out.print(pass);
    }

}

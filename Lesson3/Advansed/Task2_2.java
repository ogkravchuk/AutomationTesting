package Advansed;
import java.util.Scanner;
import java.util.TreeMap;

public class Task2_2 {
	

private static TreeMap<Integer, String> lol = new TreeMap<Integer, String>();

static {

    lol.put(1000, "M");
    lol.put(900, "CM");
    lol.put(500, "D");
    lol.put(400, "CD");
    lol.put(100, "C");
    lol.put(90, "XC");
    lol.put(50, "L");
    lol.put(40, "XL");
    lol.put(10, "X");
    lol.put(9, "IX");
    lol.put(5, "V");
    lol.put(4, "IV");
    lol.put(1, "I");
    

}

public String toRoman(int n) {

    int low =  lol.floorKey(n);
    if ( n == low ) {
        return lol.get(n);
    }
    return lol.get(low) + toRoman(n-low);
}


public static void main(String[] args) {
	Task2_2 task2 = new Task2_2();

	System.out.println(task2.toRoman(204));;
}
}
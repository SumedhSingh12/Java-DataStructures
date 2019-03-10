package datastructures.recursion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Reversal {
	public static String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		}
		else
			return reverse(s.substring(1)) + s.charAt(0);
		
	}
	public static void main(String args[]) {
		String s = "A man, a plan, a canal – Panama!";
		System.out.println(reverse(s));
	}
}

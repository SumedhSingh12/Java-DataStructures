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
		String reversed = reverse(s);
		System.out.println(reversed);
		if (s.equalsIgnoreCase(reversed)){
			System.out.println("Palindrome");
		}
		ArrayList<String> longList = new ArrayList<>();
		longList.add("Sumedh");
		longList.add("Nanhe");
		System.out.println(longList);
		
		StringBuilder epg = new StringBuilder("123456");
		epg.reverse();
		System.out.println(epg);
		
		String printDate = LocalDate.parse("2057-08-11").format(DateTimeFormatter.ISO_DATE);
		System.out.println(printDate);
		
		
	}
}

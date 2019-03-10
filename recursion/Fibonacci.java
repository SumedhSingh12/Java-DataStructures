package datastructures.recursion;
import java.util.Arrays;

public class Fibonacci {
	public static int[] fibo(int n) {
		int[] cache = new int[n+1];
		System.out.println(fibo_calc(n, cache));
		return cache;
	}
		private static int fibo_calc(int n, int[] cache) {
			if (n == 0) {
				cache[0] = 0;
				return cache[0];
			}
			else if (n==1) {
				cache[1] = 1;
				return cache[1];
			}
			else if(n != 0 && cache[n] != 0) {
				return cache[n];
				
			}
			else {
				cache[n] = fibo_calc(n-1, cache) + fibo_calc(n-2,cache);
			}
			return cache[n];
		
	}
		public static void main (String args[]) {
			while(true) {
				System.out.println("Sumedh");
				break;
			}
			Arrays.stream(fibo(10)).forEach(System.out::println);
		}

}

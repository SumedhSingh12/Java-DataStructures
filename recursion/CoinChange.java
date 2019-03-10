package datastructures.recursion;
import java.util.Arrays;

public class CoinChange {
	private static int coins(int target, int[] coins) {
		int[] cache = new int[target +1];
		return coin_changes(target, coins, cache);
	}
		private static int coin_changes(int target, int[] coins, int[] cache) {
		int min_coins = target;
		if (Arrays.asList(coins).contains(target)) {
			return 1;
		}
		else if (cache[target] != 0){
			return cache[target];
		}
		else {
			for (int value:coins) {
				if (value <= target) {
					int num_coins = 1 + coin_changes(target - value, coins, cache);
					if (num_coins < min_coins) {
						min_coins = num_coins;
						cache[target] = min_coins;
					}
				}
			}
		}
		return cache[target];
	}
	public static void main(String args[]) {
		System.out.println(coins(613, new int[] {1,2,5}));
	}
}

package datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
		
	}
	public static void main(String args[]) {
		InsertionSort insertion = new InsertionSort();
		int [] a = insertion.sort(new int[]{65, 46, 14, 52, 38, 2, 96, 39, 14, 33, 13, 4, 24, 99, 89, 77, 73, 87, 36, 81});
		System.out.println(Arrays.toString(a));
	}

}

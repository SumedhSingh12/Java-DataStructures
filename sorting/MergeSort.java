package datastructures.sorting;

import java.util.Arrays;

public class MergeSort {
	int[] a;
	
	public MergeSort(int[] array) {
		a = array;
	}
	public int mergeSorter() {
		int count = 0;
		if(a.length <= 1) {
			return 0;
		}
		int[] firstHalf = new int[a.length / 2];
		int[] secondHalf = new int[a.length - firstHalf.length];
		for (int i=0; i < firstHalf.length ; i++)
			firstHalf[i] = a[i];
		for (int i=0; i < secondHalf.length ; i++)
			secondHalf[i] = a[i + firstHalf.length];
		new MergeSort(firstHalf).mergeSorter();
		new MergeSort(secondHalf).mergeSorter();
		count = merge(firstHalf, secondHalf, count);
		return count;
		
	}

	private int merge(int[] firstHalf, int[] secondHalf, int count) {
		int firstCounter = 0;
		int secondCounter = 0;
		int mergedCounter = 0;
		while(firstCounter < firstHalf.length && secondCounter < secondHalf.length) {
			if(firstHalf[firstCounter] <= secondHalf[secondCounter]) {
				a[mergedCounter] = firstHalf[firstCounter];
				count++;
				firstCounter++;
			}
			else {
				a[mergedCounter] = secondHalf[secondCounter];
				count++;
				secondCounter++;
			}
			mergedCounter++;
		}
		while(firstCounter < firstHalf.length) {
			a[mergedCounter] = firstHalf[firstCounter];
			firstCounter++;
			mergedCounter++;
		}
		while(secondCounter < secondHalf.length) {
			a[mergedCounter] = secondHalf[secondCounter];
			secondCounter++;
			mergedCounter++;
		}
		return count;
	}
	public static void main(String args[]) {
		MergeSort merge = new MergeSort(new int[] {1, 20, 6, 4, 5});
		int inversion = merge.mergeSorter();
		System.out.println(Arrays.toString(merge.a));
		System.out.println(inversion);
	}

}

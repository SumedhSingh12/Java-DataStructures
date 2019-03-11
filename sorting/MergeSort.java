package datastructures.sorting;

import java.util.Arrays;

public class MergeSort {
	int[] a;
	
	public MergeSort(int[] array) {
		a = array;
	}
	public void mergeSorter() {
		if(a.length <= 1) {
			return;
		}
		int[] firstHalf = new int[a.length / 2];
		int[] secondHalf = new int[a.length - firstHalf.length];
		for (int i=0; i < firstHalf.length ; i++)
			firstHalf[i] = a[i];
		for (int i=0; i < secondHalf.length ; i++)
			secondHalf[i] = a[i + firstHalf.length];
		new MergeSort(firstHalf).mergeSorter();
		new MergeSort(secondHalf).mergeSorter();
		merge(firstHalf, secondHalf);
	}

	private void merge(int[] firstHalf, int[] secondHalf) {
		int firstCounter = 0;
		int secondCounter = 0;
		int mergedCounter = 0;
		while(firstCounter < firstHalf.length && secondCounter < secondHalf.length) {
			if(firstHalf[firstCounter] <= secondHalf[secondCounter]) {
				a[mergedCounter] = firstHalf[firstCounter];
				firstCounter++;
			}
			else {
				a[mergedCounter] = secondHalf[secondCounter];
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
	}
	public static void main(String args[]) {
		MergeSort merge = new MergeSort(new int[]{65, 46, 14, 52, 38, 2, 96, 39, 14, 33, 13, 4, 24, 99, 89, 77, 73, 87, 36, 81});
		merge.mergeSorter();
		System.out.println(Arrays.toString(merge.a));
	}

}

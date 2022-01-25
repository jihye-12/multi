package algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = { 4, 5, 2, 3, 1 };
		System.out.println(Arrays.toString(data));
		selectionSort(data);
		System.out.println(Arrays.toString(data));
	}

	static void selectionSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < data.length; j++) {
				// 최소값 찾기
				if (data[j] < data[min]) {
					min = j;
				}
			}
			int tmp = data[i];
			data[i] = data[min];
			data[min] = tmp;
		}
	}
}

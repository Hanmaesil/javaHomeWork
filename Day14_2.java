package homework;

import java.util.Arrays;

public class Day14_2 {

	public static void main(String[] args) {

		// 문제 : 배열 합병후 오름차순으로 출력하시오

		int[] A = { 1, 3, 5, 7, 8, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int merge[] = mergeArray(A, B);
		System.out.println(Arrays.toString(merge));

	}

	public static int[] mergeArray(int[] A, int[] B) {
		int[] merge = new int[A.length + B.length]; // 합칠 배열의 길이는 두개의 배열 길이를 합친 값.

		for (int i = 0; i < A.length; i++) { // A배열을 merge배열로 옮기기
			merge[i] = A[i];
		}
		for (int i = A.length; i < merge.length; i++) { // B배열을 merge 배열로 옮기기.
			merge[i] = B[i - A.length];
		}
//		System.out.println(Arrays.toString(merge)); //들어갔나 확인.

		for (int i = 0; i < merge.length - 1; i++) { // 버블정렬
			for (int j = 0; j < merge.length - 1 - i; j++) {
				if (merge[j] > merge[j + 1]) {
					int temp = merge[j + 1];
					merge[j + 1] = merge[j];
					merge[j] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(merge)); //들어갔나 확인.
		
		return merge;
		
		
		
		
	}

}

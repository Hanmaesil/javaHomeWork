package homework;

import java.util.Arrays;

public class Day14_2 {

	public static void main(String[] args) {

		// ���� : �迭 �պ��� ������������ ����Ͻÿ�

		int[] A = { 1, 3, 5, 7, 8, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int merge[] = mergeArray(A, B);
		System.out.println(Arrays.toString(merge));

	}

	public static int[] mergeArray(int[] A, int[] B) {
		int[] merge = new int[A.length + B.length]; // ��ĥ �迭�� ���̴� �ΰ��� �迭 ���̸� ��ģ ��.

		for (int i = 0; i < A.length; i++) { // A�迭�� merge�迭�� �ű��
			merge[i] = A[i];
		}
		for (int i = A.length; i < merge.length; i++) { // B�迭�� merge �迭�� �ű��.
			merge[i] = B[i - A.length];
		}
//		System.out.println(Arrays.toString(merge)); //���� Ȯ��.

		for (int i = 0; i < merge.length - 1; i++) { // ��������
			for (int j = 0; j < merge.length - 1 - i; j++) {
				if (merge[j] > merge[j + 1]) {
					int temp = merge[j + 1];
					merge[j + 1] = merge[j];
					merge[j] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(merge)); //���� Ȯ��.
		
		return merge;
		
		
		
		
	}

}

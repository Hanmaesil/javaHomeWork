package homework;

import java.util.Random;

public class Day06 {

	public static void main(String[] args) {

		// 1�� : 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� �� ���� ū ���� ���� ���� ���� ����Ͻÿ�.(�������� �ߺ��Ǹ� �ȵȴ�.)

		Random ran = new Random();

//		int[] array = new int[8];
//		
//		System.out.print("�迭�� �ִ� ��� �� : ");
//		for(int i = 0; i < array.length; i++) {
//			array[i] = ran.nextInt(10) + 1;
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(array[i] == array[j]) {
//					array[i] = ran.nextInt(10) + 1;
//				}
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}System.out.println();
//		
//		int max = array[0];
//		int min = array[0];
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] < min) {
//				min = array[i];
//			}
//		}
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
//		

		// ���ٷ� �����
//		for (int i = 0; i < 8; i++) {
//	         array[i] = ran.nextInt(100) + 1;
//	         for (int j = 0; i > j; j++) {
//	            if (array[i] == array[j]) {
//	               i = i - 1;
//	            }

		// syso(�迭 ����ϱ�)

		// 2�� : �ߺ��� ���� ���ڸ� �̴� �ζ� ���α׷��� ����ÿ�

		int[] array1 = new int[6];

		for (int i = 0; i < array1.length; i++) {
			int num = ran.nextInt(45) + 1;
			array1[i] = num;
			for (int j = 0; i > j; j++) {
				if (array1[i] == array1[j]) {
					i = i - 1;
				}
			}
		}
		for(int i = 0; i < array1.length; i++) {
			System.out.println("����� ���� : " + array1[i]);
		}
		
		

	}

}

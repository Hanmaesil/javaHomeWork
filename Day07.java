package homework;

import java.util.Random;
import java.util.Scanner;

public class Day07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 1�� : N�� X�� �Է� �޴´�.
		// N���� ������ �Է� �޴´�.
		// N���� ���� �� X���� ���� ���� ��� �Ѵ�.

//		System.out.print("N �Է� : ");
//		int num1 = sc.nextInt();
//		System.out.print("X �Է� : ");
//		int num2 = sc.nextInt();
//
//		int[] ary = new int[num1];
//
//		for (int i = 0; i < num1; i++) {
//			System.out.print(i + 1 + "��° ���� �Է� : ");
//			int j = sc.nextInt();
//			ary[i] = j;
//		}
//		System.out.print("��� : ");
//		for (int i = 0; i < ary.length; i++) {
//			if (ary[i] < num2) {
//				System.out.print(ary[i] + " ");
//			}
//		}

//		int max = ary[0];
//		int min = ary[0];
//
//		for(int i = 0; i < num1; i++) {
//			if(ary[i] < min) {
//				min = ary[i];
//			}
//		}
//		
//		System.out.println(ary[5]);
//		System.out.println(min);

		// 2�� : �Ʒ��� ���� 1������ ������ �־����� ��,
		// �� �� ���� �Ÿ��� ª�� ��(index)���� ����Ͻÿ�.
		// (��, ���� ������ �Ÿ��� ��� �ٸ���)
		
		
		
		int[] point = {92,32,52,9,81,2,68};
		int result = 0;
		
		for(int i = 0; i < point.length; i++) {
			for(int j = 0; j < i; j++) {
				if(point[i] - point[j] >= 1) {
					result = point[i] - point[j]; 
				}
			}
		}
		int min = point[0];
		
		for(int i = 0; i < point.length; i++) {
			for(int j = 0; j <i; j++) {
				if(point[i] < min) {
					point[i] = min;
				}
			}
		}
		System.out.println(min);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		

	}

}

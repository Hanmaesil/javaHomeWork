package homework;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {

		// ���� 1�� : ���� N�� �Է¹޾� N * N �迭�� ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� N�Է� : ");
//		int num = sc.nextInt();
//		int[][] ary = new int[num][num];
//		int cnt = 1;
//
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				if (i % 2 == 0) {
//					ary[i][j] = cnt;
//					cnt++;
//				} else if (i % 2 == 1) {
//					for (j = ary.length -1; j >= 0; j--) {
//						ary[i][j] = cnt;
//						cnt++;
//					}if(j == -1)
//						break;
//				}
//			}
//		}
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary.length; j++) {
//				System.out.printf("%3d", ary[i][j]);
//			}
//			System.out.println();
//		}

		//2�� : �Ʒ��� ���� 2���� �迭�� �������� 90�� ȸ���Ͽ� ����Ͻÿ�.

		System.out.println("����");
		int[][] ary = new int[5][5];
		
		int cnt = 1;
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary.length; j++) {
				ary[i][j] = cnt;
				cnt++;
			}
		}
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary.length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}System.out.println();
		}
		
		System.out.println("90�� ȸ��");
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < ary.length; j++) {
				System.out.printf("%3d",ary[j][i]);
			}System.out.println();
		}
		
		
		//3�� : �𷡽ð�
		//���ĺ� ������� ������ ���� �𷡽ð� ����� ����ϴ�
		//�ڵ带 �ۼ��Ͽ� ����Ͻÿ�.

		
		
	}

}

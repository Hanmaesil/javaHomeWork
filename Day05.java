package homework;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		// ���� 1�� : ���� n�� �Է¹޾� 1, 2, 4, 7, 11 �� ���� ������ n��° �ױ��� ����Ͻÿ�.

//		System.out.println(1);
//		System.out.println(1+1);
//		System.out.println(1+1+2);
//		System.out.println(1+1+2+3);

		Scanner sc = new Scanner(System.in);

//		System.out.print("n �Է� : ");
//		int num = sc.nextInt();
//		int j = 1;
//		
////		1���� �����ؼ� 1�� ���ϸ� 2�� �Ǵµ� 2�� �ٽ� 2�� ���ϴ� ���
//		for(int i = 0; i < num; i++) { //i�� num������ ������ true
//			j =  j +  i;				// j�� ��� �����Ǵ� ��. 1�� �����ؼ� i�� �����ϸ鼭 �������� ��� j���� �ȴ�.
//			System.out.print(j + " "); // j���� ���ö����� ������ ���

		// 2�� : �� ������ �Է� �޾� ������ ���� �ﰢ���� ����Ͻÿ�.
		// �� ��� �Ѥ�
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*");
//			}System.out.println();
//		}

		// ������ �����
//		for (int j = 5; j >= 0; j--) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*");
//			}System.out.println("");
//		}

		System.out.print("�� ���� : ");
		int num = sc.nextInt();

		for (num = 7; num >= 0; num--) {
			for (int i = 1; i <= num; i++) {
				System.out.print("*");
			}System.out.println("");
		}

	}

}

package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Day13_2 {
	public static void main(String[] args) {

		// ���� : �׸��� ���� ���(��_��)���ڷ� ������ ������ ���ڸ�
		// �־��� ���ڿ� ���� ����ϰ� ������ ���ǰ� �Ǵ�
		// ����� ������ ����ϴ� ���α׷��� �ۼ��϶�

		Scanner sc = new Scanner(System.in);

		System.out.print("ù�ڸ� 0 �� ������ ���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		transForm(num);

	}

	public static void transForm(int input) {
		int[] ary = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 }; //���ڸ� ��� ������ ǥ��
		int a = 0; // ��
		int b = 0; // ������
		int sum = 0; // ��°�

		while (true) {
			a = input / 10;
			b = input % 10;
			sum += ary[b];
			input = a; //���� �ٽ� input������ �־��ش�.
			if (a / 10 == 0) { // ���� ����
				sum += ary[a]; // ������ ���� �����ش�.
				break;	
			}
			
		}
		System.out.println("���(' - ')�� ������ : " + sum);

	}

}

package homework;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//for(i = 1; num1 > num2 ? : num2���� : num1����)
		//while(
		
		
//		// ���� 1�� : �� ������ �Է¹޾� �ִ�����&�ּҰ������ ����Ͻÿ�.
//		
//		
		
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();

		int b = num1 > num2 ? num2 : num1; // �ΰ��� ������ ������ ���� ����
		int divisor = 0;

		for (int i = 1; i <= b; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				divisor = i;
			}
		}
		System.out.println("�ִ����� : " + divisor);
		System.out.println("�ּҰ���� : " + (divisor * num1 / divisor * num2 / divisor));


		// ����2�� : 1���� ū ����(N)�� �Է��Ͽ� N!���� ���Ͻÿ�.
		System.out.print("�Է� : ");
		int num = sc.nextInt();

		int i = 0;
		int a = 1;

		for (i = 1; i < num; i++) {
			a *= i;
		}
		System.out.println(a);

	}

}

package homework;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {

		/*
		 * 1�� :�� ���� ������ �Ű������� �޾� ���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ� isDivide( ) �� �ۼ��ϼ���. �̶�,
		 * ���������� true, ���������� ������ false�� ��ȯ��.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		return num1 % num2 == 0;

	}

}

package homework;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//���� 1�� : ���μ� ���ظ� ���ִ� ���α׷��� �ۼ��Ͻÿ�.

		System.out.print("���μ����ظ� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num = num / i;
				System.out.print(i);
				i=1;
			if(num  != i) {
				System.out.print("*");	
			}
				

		}

		// ���� 2�� : A,B ���ڸ� �Է� �޴´�.
		// A-B�� ����Ѵ�.
		// A�� B�� ��� 0�� �Է� ������ ���α׷��� ����ȴ�.

//		int a = 0;
//		int b = 1;
//		int result = a - b;
//
//		while (true) {
//			System.out.print("A�Է� : ");
//			a = sc.nextInt();
//			System.out.print("B�Է� : ");
//			b = sc.nextInt();
//			System.out.println("��� : " + result);
//
//			if (a == 0 && b == 0)
//				break;
//		}System.out.println("����");
//	}

	}
	}
}

package homework;

import java.util.Random;

public class Day11_1 {

	public static void main(String[] args) {

		// ���� : num1, num2, op (+, -, *, /) �� �Ű������� �޾� num1�� num2�� op�� �°� ������ �������
		// ��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���.

		Random ran = new Random();
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		

		System.out.println("ù��° ���� ���� : " + num1);
		System.out.println("�ι�° ���� ���� : " + num2);

		int result = cal(num1, num2);

	}
	
	public static int cal(int num1, int num2) {
		
		
		return -1;
	}
	
	
	
	
}

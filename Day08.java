package homework;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		// 1�� : 10������ �Է¹޾� 2������ ��ȯ�ϼ���
//
//		// 2��5���� ������ �Է� �޾� �������� �����Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�. (��������)
//
//		int[] num = new int[5];
////		int[] num = { 9, 6, 7, 5, 3 }; //Ȯ�ο�
//
//		for(int i = 0; i < num.length; i++) {  //�迭 �Է¹ޱ�.
//			System.out.print(i+1 + "��° �� ���� : ");
//			num[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < num.length; i++) { 
//			for (int j = 0; j < num.length; j++) {
//				if (num[i] < num[j]) { //�ϳ��� ���غ���, �ε�ȣ ��ȣ�� �ٲ�� ������ �ٲ�.
//					int change = num[i]; // �ٲ�� ���� ū���� ���� ����
//					num[i] = num[j]; // ū���� ���� ������ �ٲ�
//					num[j] = change; // ���� �� ��ġ�� �ٽ� ū���� �ִ´�.
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
		//3�� : 5���� ������ �Է� �޾� ���������� Ȱ���Ͽ� �������� �����Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�.
		//�ٽ� �ѹ� �غ���... �ʹ� ����� �ФФФ�
		int[] num = {9,8,5,7,2};
//		int[] num = new int[5];
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(i+1 + "��° �� �Է� : ");
//			num[i] = sc.nextInt();
//		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length -1; j++) {
				if(num[i] < num[j]) {
					swap(num, i,j);
				}
			}
		}System.out.println("���� ��");
		for(int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + " ");
		}
		
		
		
		
		
		

	}

	private static void swap(int[] num, int i, int j) {
		int change = num[i];
		num[i] = num[j];
		num[j] = change;
		
		
	}

}

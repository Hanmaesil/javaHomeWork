package homework;

import java.util.Random;

public class Day06 {

	public static void main(String[] args) {
		
		//1�� : 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� �� ���� ū ���� ���� ���� ���� ����Ͻÿ�.
		
		Random ran = new Random();
		int[] array = new int[8];
		
		System.out.print("�迭�� �ִ� ��� �� : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			for(int j = 0; j < i; j++)
				if(array[i] == array[j]) { 
					i = i-1;
				}
				
		}
		//syso(�迭 ����ϱ�)
		
		//2�� : �ߺ��� ���� ���ڸ� �̴� �ζ� ���α׷��� ����ÿ�
		
//		int[] array1 = new int[6];
//		
//		for(int i = 0; i < array1.length; i++) {
//			int num = ran.nextInt(45)+1;
//			System.out.println("����� ���� : " + num);
//			array1[i] = num;
//			for(int j = 0; j < 6; j++)
//			if(array1[i] == array1[j]){ 
//				int num1 = ran.nextInt(45) + 1;
//				array1[i] = num1;
//				j = j -1;
//			}
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

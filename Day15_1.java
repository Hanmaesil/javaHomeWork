package homework;

import java.util.Arrays;

public class Day15_1 {

	public static void main(String[] args) {

		// ���� : ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
		// ������� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
		// isHarshad�޼ҵ�� ���� ���� n�� �Ű������� �Է¹޽��ϴ�.
		// �� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���. ������� n�� 10, 12, 18�̸� True�� ���� 11, 13�̸� False��
		// �����ϸ� �˴ϴ�.

		System.out.println(isHarshad(18));
		System.out.println(isHarshad(12));
		System.out.println(isHarshad(18));
		System.out.println(isHarshad(11));
		System.out.println(isHarshad(13));
		
	}

	public static boolean isHarshad(int num) {
		String a =  Integer.toString(num); //������ �����͸� ���������� ��ȯ
		char[] array = a.toCharArray(); //������ �����͸� ĳ���� �迭�� ��ȯ.
		int sum = 0; // �迭�� �ִ� ���� ���� ����.

		//�ƽ�Ű �ڵ� : '0'�� 48, '1'�� 49, '2'�� 50 ......'9'�� 57�̴�
		//ĳ���͸� ��Ʈ������ �ٲٴ¹� : ĳ������ ���� - '0'
		//->> ex) '1' = 49, '0' = 48 ->> '1' - '0' == 49 - 48 = 1 �� ���´�.  
		
		for(int i = 0; i < array.length; i++) { //ĳ���͸� ��Ʈ�� �ٲٴ� ��.
			sum += array[i] -'0'; //�ƽ�Ű �ڵ忡�� '0'�� 48�̴�.
		}if(num % sum == 0) { //ex) 1+8 =9 �� sum,, num = 18 ->>> 18%9==0
			return true;
		}else
			return false;
		
//		System.out.println(Arrays.toString(array));
				
		
		

	}

}

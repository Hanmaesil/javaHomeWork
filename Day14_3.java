package homework;

import java.util.Arrays;

public class Day14_3 {

	public static void main(String[] args) {

		// ���� : getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�.
		// �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������.
		// �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�. ������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�,
		// �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("tese"));

	}
	
	public static char getMiddle(String sentence) {
		char[] array = sentence.toCharArray();
		System.out.println(Arrays.toString(array));
		
		
		
		
		return 0;
		
	}
	
	
	
	
}

package homework;


public class Day12_1 {

	public static void main(String[] args) {

		// ���� : ���ڿ��� �Է¹޾� ���ĺ�������� �����Ͽ� ��ȯ�ϴ�
		// �޼ҵ带 �����Ͻÿ�.
		// ��, ��ҹ��ڴ� �����Ѵ�.

		System.out.println(reverseStr("ZAbcdasAe"));

	}

	public static String reverseStr(String Stc) {

		char[] array = Stc.toCharArray(); // ��Ʈ���� ĳ���� �迭�� �޴� ��ɾ�
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					char temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}//��������
			}
		}
		String str = new String(array); //ĳ���� �迭�� ��Ʈ������ ��ȯ
		return str;
	}

}

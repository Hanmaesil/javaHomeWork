package homework;

public class Day12_2 {

	public static void main(String[] args) {

		// ���� : ���￡�� �輭�� ã��
		// findKim �޼ҵ�� String�� �迭 names�� �Ű������� �޽��ϴ�.
		// names�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϼ���. names�� "Kim"�� ���� �� ����
		// ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

		String[] name = {"Quuen", "Tod","Kim"};
		System.out.println(findkim(name));

	}

	public static String findkim(String[] name) {

		if (name[0].equals("Kim")) {
			return "�輭���� 1�� �ִ�";
		} else if (name[1].equals("Kim")) {
			return "�輭���� 2�� �ִ�.";
		} else if (name[2].equals("Kim")) {
			return "�輭���� 3�� �ִ�.";
		} else
			return null;

	}

}

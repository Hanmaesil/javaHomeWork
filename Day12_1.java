package homework;

import java.util.ArrayList;

public class Day12_1 {

	public static void main(String[] args) {

		// ���� : ���ڿ��� �Է¹޾� ���ĺ�������� �����Ͽ� ��ȯ�ϴ�
		// �޼ҵ带 �����Ͻÿ�.
		// ��, ��ҹ��ڴ� �����Ѵ�.

		System.out.println(reverseStr("ZAbcdasAe"));

	}

	public static ArrayList<String> reverseStr(ArrayList<String> ary) {
		System.out.println(ary.get(0));
		for (int i = 0; i < ary.size() - 1; i++) {
			for (int j = i + 1; j < ary.size() - i - 1; j++) {
				if (ary.get(j).compareTo(ary.get(j + 1)) < 0) {
					String temp = ary.get(j + 1);
					ary.set(j + 1, ary.get(j));
					ary.set(j, temp);
				}

			}

		}
		return reverseStr;

	}
}

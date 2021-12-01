package homework;

import java.util.ArrayList;

public class Day12_1 {

	public static void main(String[] args) {

		// 문제 : 문자열을 입력받아 알파벳순서대로 정렬하여 반환하는
		// 메소드를 구현하시오.
		// 단, 대소문자는 구분한다.

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

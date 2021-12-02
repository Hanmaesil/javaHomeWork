package homework;


public class Day12_1 {

	public static void main(String[] args) {

		// 문제 : 문자열을 입력받아 알파벳순서대로 정렬하여 반환하는
		// 메소드를 구현하시오.
		// 단, 대소문자는 구분한다.

		System.out.println(reverseStr("ZAbcdasAe"));

	}

	public static String reverseStr(String Stc) {

		char[] array = Stc.toCharArray(); // 스트링을 캐릭터 배열로 받는 명령어
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					char temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}//버블정렬
			}
		}
		String str = new String(array); //캐릭터 배열을 스트링으로 변환
		return str;
	}

}

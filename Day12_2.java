package homework;

public class Day12_2 {

	public static void main(String[] args) {

		// 문제 : 서울에서 김서방 찾기
		// findKim 메소드는 String형 배열 names을 매개변수로 받습니다.
		// names중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하세요. names에 "Kim"은 오직 한 번만
		// 나타나며 잘못된 값이 입력되는 경우는 없습니다.

		String[] name = {"Quuen", "Tod","Kim"};
		System.out.println(findkim(name));

	}

	public static String findkim(String[] name) {

		if (name[0].equals("Kim")) {
			return "김서방은 1에 있다";
		} else if (name[1].equals("Kim")) {
			return "김서방은 2에 있다.";
		} else if (name[2].equals("Kim")) {
			return "김서방은 3에 있다.";
		} else
			return null;

	}

}

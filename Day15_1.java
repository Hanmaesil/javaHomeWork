package homework;

import java.util.Arrays;

public class Day15_1 {

	public static void main(String[] args) {

		// 문제 : 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
		// 예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
		// isHarshad메소드는 양의 정수 n을 매개변수로 입력받습니다.
		// 이 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요. 예를들어 n이 10, 12, 18이면 True를 리턴 11, 13이면 False를
		// 리턴하면 됩니다.

		System.out.println(isHarshad(18));
		System.out.println(isHarshad(12));
		System.out.println(isHarshad(18));
		System.out.println(isHarshad(11));
		System.out.println(isHarshad(13));
		
	}

	public static boolean isHarshad(int num) {
		String a =  Integer.toString(num); //숫자형 데이터를 문자형으로 변환
		char[] array = a.toCharArray(); //문자형 데이터를 캐릭터 배열로 변환.
		int sum = 0; // 배열에 있는 수를 더할 변수.

		//아스키 코드 : '0'은 48, '1'은 49, '2'는 50 ......'9'는 57이다
		//캐릭터를 인트형으로 바꾸는법 : 캐릭터형 숫자 - '0'
		//->> ex) '1' = 49, '0' = 48 ->> '1' - '0' == 49 - 48 = 1 이 나온다.  
		
		for(int i = 0; i < array.length; i++) { //캐릭터를 인트로 바꾸는 식.
			sum += array[i] -'0'; //아스키 코드에서 '0'은 48이다.
		}if(num % sum == 0) { //ex) 1+8 =9 가 sum,, num = 18 ->>> 18%9==0
			return true;
		}else
			return false;
		
//		System.out.println(Arrays.toString(array));
				
		
		

	}

}

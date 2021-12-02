package homework;


public class Day13_3 {

	public static void main(String[] args) {
		// 문제 : 아래와 같이 학생들의 성적정보가 문자열로
		// 선언되어 있을 때 각 성적 별 학생 수를 출력하시오.

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		student(score);

	}
	public static void student(String score) {
		String[] ary = score.split(","); //입력받은 문자열을 분리시켜서 정렬로 넣는 명령어
		int A = 0;						 //String[] 배열변수이름 = 받는값.split(받는 형식);
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		
		for(int i = 0; i < ary.length; i++) {
			if(ary[i].equals("A")) {
				A++;
			}else if(ary[i].equals("B")) {
				B++;
			}else if(ary[i].equals("C")) {
				C++;
			}else if(ary[i].equals("D")) {
				D++;
			}else if(ary[i].equals("F")) {
				F++;
			}
		}
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");
		
		
	}
	
	
	
}

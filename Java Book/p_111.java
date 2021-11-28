import java.util.Scanner;

public class p_111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//7번 : 사각형은 (100,100)과 (200,200)의 두점으로 이루어져있다.
//		// 정수 x 와 y 를 입력받아 직사각형 안에 있는지 판별하시오.
//		
//		int x1 = 100;
//		int x2 = 200;
//		
//		int y1 = 100;
//		int y2 = 200;
//		
//		System.out.printf("사각형은 (%d,%d) (%d,%d) 의 두점으로 이루어져 있다.%n",x1,y1,x2,y2);
//		//printf : %d - 정수, %s - 문자열 , %n -  줄바꿈
//		System.out.print("점 (x,y)의 좌표를 입력하시오 : ");
//		int inputX = sc.nextInt();
//		int inputY = sc.nextInt();
//		
//		
//		if(inputX>=  100 && inputX<=200 && inputY >=100 && inputY <=200) {
//			System.out.printf("(%d, %d)는 사각형 안에 있습니다.",inputX, inputY);
//		}else
//			System.out.printf("(%d, %d)는 사각형 안에 없습니다.",inputX, inputY);
		
		//8번 다시풀어보기.
//		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
//			if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
//				return true;
//			else return false;
//		}
		
		//9번 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라
		// 그리고 실수 값으로 다른점 (x,y)를 입력받아 이 점이 내부에 있는지 판별하여 출력하라
		// 원의 방정식 : (
		System.out.print("원의 중심과 반지름 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double r = sc.nextDouble();
		

		
		System.out.print("점 입력 : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double dis = Math.sqrt((x-a) * (x-a) + ( y-b) * (y-b)); // Math.sqrt() : 제곱근 ex) Math.sart(4) = 2
		
		if(dis < r) {
			System.out.printf("점 (%.1f , %.1f) 는 원 안에 있다.",x,y);
		}else
			System.out.printf("점 (%.1f , %.1f) 는 원 안에 없다..",x,y);
			
		
		
		
		
		
		
	}

}

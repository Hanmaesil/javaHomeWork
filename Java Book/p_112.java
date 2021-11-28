import java.util.Scanner;

public class p_112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문제 10번 : 원의 정보를 두개 받고, 두 원이 서로 겹치는지 판단하여 출력하라
		
		System.out.print("첫번째 원의 중심과 반지름을 입력 : ");
		double cricle1x = sc.nextDouble();
		double cricle1y = sc.nextDouble();
		double cricle1r = sc.nextDouble();
		
		
		
		System.out.print("두번째 원의 중심과 반지름을 입력 : ");
		double cricle2x = sc.nextDouble();
		double cricle2y = sc.nextDouble();
		double cricle2r = sc.nextDouble();
		
		double centerDis = 0; // 두 점사이의 차이 구하는 식(두 점사이의 차이와 두 반지름의 합과 차이를 비교해서 겹치는 유무를 알수있다.)
		double sum = cricle1r + cricle2r; //두 반지름의 합
		double minus = Math.abs(cricle1r - cricle2r); // 두 반지름의 차
		
		if(cricle1x > cricle2x) {
			centerDis = cricle1x - cricle2x;
		}else
			centerDis = cricle2x - cricle1x;
		
		if(minus < centerDis && centerDis < sum) {
			System.out.println("두 원은 서로 겹친다.");
		}else if(sum == centerDis){
			System.out.println("두 원은 서로 겹친다.");
		}else if(minus == centerDis) {
			System.out.println("두 원은 서로 겹친다.");
		}else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		//쉽게 푸는법 : 두개의 반지름의 합보다 작으면 원이 겹친다 ->>이해가 안됨 ㅠㅠ
		//distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));

		
		
		
	}

}

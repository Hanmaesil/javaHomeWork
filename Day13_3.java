package homework;


public class Day13_3 {

	public static void main(String[] args) {
		// ���� : �Ʒ��� ���� �л����� ���������� ���ڿ���
		// ����Ǿ� ���� �� �� ���� �� �л� ���� ����Ͻÿ�.

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		student(score);

	}
	public static void student(String score) {
		String[] ary = score.split(","); //�Է¹��� ���ڿ��� �и����Ѽ� ���ķ� �ִ� ��ɾ�
		int A = 0;						 //String[] �迭�����̸� = �޴°�.split(�޴� ����);
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
		System.out.println("A : " + A + "��");
		System.out.println("B : " + B + "��");
		System.out.println("C : " + C + "��");
		System.out.println("D : " + D + "��");
		System.out.println("F : " + F + "��");
		
		
	}
	
	
	
}

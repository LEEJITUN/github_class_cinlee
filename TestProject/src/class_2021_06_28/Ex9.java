package class_2021_06_28;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �߽ɰ� ������ �Է� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		float rat = sc.nextFloat();
		
		System.out.println("�� �Է� >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if((x2 - x1) <= rat ){
			System.out.println("�� ("+ x2 + "," + y2 + ")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("�� ("+ x2 + "," + y2 + ")�� �� �ȿ� ���� �ʴ�.");			
		}

	}

}

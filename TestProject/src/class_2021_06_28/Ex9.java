package class_2021_06_28;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �߽ɰ� ������ �Է� >> ");
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double rad = sc.nextFloat();
		
		System.out.println("�� �Է� >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextInt();
		
		double dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		if(dist <= rad ){
			System.out.println("�� ("+ x2 + "," + y2 + ")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("�� ("+ x2 + "," + y2 + ")�� �� �ȿ� ���� �ʴ�.");			
		}
		sc.close();
	}

}

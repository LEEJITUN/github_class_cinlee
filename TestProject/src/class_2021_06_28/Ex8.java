package class_2021_06_28;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2= sc.nextInt();
		int y2 = sc.nextInt();
		
		boolean flag1 = inReject(100,100,x1,y1,x2,y2);
		boolean flag2 = inReject(200,200,x1,y2,x1,y2);
		boolean flag3 = inReject(100,200,x1,y1,x2,y2);
		boolean flag4 = inReject(200,100,x2,y2,x1,y1);
		
		boolean flag5 = inReject(x1,y1,100,100,200,200);
		boolean flag6 = inReject(x1,y2,100,100,200,200);
		boolean flag7 = inReject(x2,y1,100,100,200,200);
		boolean flag8 = inReject(x2,y2,100,100,200,200);

		
		if(flag1 || flag2 || flag3 || flag4) {
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		}else if(flag5 ||  flag6 || flag7 || flag8) {
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		}else {
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");			
		}
	}
	
	public static boolean inReject (int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {
		
		if((x >= rect_x1 && x <= rect_x2) && (y>=rect_y1 && y<= rect_y2)) {
			return true;
		}else {
				return false;
		}
	}
}
package class_2021_06_28;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x > 101 && x < 201) && (y > 101 && y < 201)) {
			System.out.println("(" +x+"," + y + ") �� �簢�� �ȿ� �ֽ��ϴ�." );
		}else {
			System.out.println("(" +x+"," + y + ") �� �簢�� �ȿ� ���� �ʽ��ϴ�.");
		}
		
		
	}
}

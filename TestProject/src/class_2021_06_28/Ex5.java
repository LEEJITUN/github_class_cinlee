package class_2021_06_28;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է� >>");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(((num1 + num2) > num3) ||((num1 + num3) > num2) ||((num2 + num3) > num1)) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		}
		
		
	}
}
package class_2021_06_28;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.println("2�ڸ��� ���� �Է�(10~99) >>");
		int num = sc.nextInt();

		if(9 < num && num < 100) {
			if(num /10 == num %10) {
				str = "����";
			}else {
				str= "����";
			}	
		}else {
			str = "2�ڸ����� ������ �Է����ּ���.";		
		}
		System.out.println(str);
	}

}

package class_2021_06_28;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �̷��Ͻÿ� >>");
		int won = sc.nextInt();
		
		int cnt = won /50000;
		won %= 50000;
		System.out.println("�������� " + cnt + "��");
		 cnt = won /10000;
		 won %= 10000;
		System.out.println("������ " + cnt + "��");
		 cnt = won /1000;
		 won %= 1000;
		System.out.println("õ���� " + cnt + "��");
		 cnt = won /500;
		 won %= 500;
		System.out.println("����� " + cnt + "��");
		 cnt = won /100;
		 won %= 100;
		System.out.println("��� " + cnt + "��");
		 cnt = won /50;
		 won %= 50;
		System.out.println("���ʿ� " + cnt+ "��");
		 cnt = won /10;
		 won %= 10;
		System.out.println("�ʿ� " + cnt + "��");


	}

}

package class_2021_06_28;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �̷��Ͻÿ� >>");
		int won = sc.nextInt();
		
		int cnt = won /50000;
		int num = won % 50000;
		System.out.println("�������� " + cnt + "��");
		 cnt = num /10000;
		 num %= 10000;
		System.out.println("������ " + cnt + "��");
		 cnt = num /1000;
		 num %= 1000;
		System.out.println("õ���� " + cnt + "��");
		 cnt = num /500;
		 num %= 500;
		System.out.println("����� " + cnt + "��");
		 cnt = num /100;
		 num %= 100;
		System.out.println("��� " + cnt + "��");
		 cnt = num /50;
		 num %= 50;
		System.out.println("���ʿ� " + cnt+ "��");
		 cnt = num /10;
		 num %= 10;
		System.out.println("�ʿ� " + cnt + "��");


	}

}

package class_2021_06_25;

import java.util.Scanner;

public class EX02_05_ArithmeticOperator {


	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time/60) % 60;
		hour = (time/60) /60;
		
		System.out.println(time + "�ʴ�");
		System.out.println(hour + "�ð�,");
		System.out.println(minute + "��,");
		System.out.println(second + "���Դϴ�.");
		
	}
}

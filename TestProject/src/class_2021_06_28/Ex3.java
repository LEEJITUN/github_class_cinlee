package class_2021_06_28;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 이력하시오 >>");
		int won = sc.nextInt();
		
		int cnt = won /50000;
		int num = won % 50000;
		System.out.println("오만원권 " + cnt + "매");
		 cnt = num /10000;
		 num %= 10000;
		System.out.println("만원권 " + cnt + "매");
		 cnt = num /1000;
		 num %= 1000;
		System.out.println("천원권 " + cnt + "매");
		 cnt = num /500;
		 num %= 500;
		System.out.println("오백원 " + cnt + "매");
		 cnt = num /100;
		 num %= 100;
		System.out.println("백원 " + cnt + "매");
		 cnt = num /50;
		 num %= 50;
		System.out.println("오십원 " + cnt+ "매");
		 cnt = num /10;
		 num %= 10;
		System.out.println("십원 " + cnt + "매");


	}

}

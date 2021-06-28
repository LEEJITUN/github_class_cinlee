package class_2021_06_28;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 이력하시오 >>");
		int won = sc.nextInt();
		
		int cnt = won /50000;
		won %= 50000;
		System.out.println("오만원권 " + cnt + "매");
		 cnt = won /10000;
		 won %= 10000;
		System.out.println("만원권 " + cnt + "매");
		 cnt = won /1000;
		 won %= 1000;
		System.out.println("천원권 " + cnt + "매");
		 cnt = won /500;
		 won %= 500;
		System.out.println("오백원 " + cnt + "매");
		 cnt = won /100;
		 won %= 100;
		System.out.println("백원 " + cnt + "매");
		 cnt = won /50;
		 won %= 50;
		System.out.println("오십원 " + cnt+ "매");
		 cnt = won /10;
		 won %= 10;
		System.out.println("십원 " + cnt + "매");


	}

}

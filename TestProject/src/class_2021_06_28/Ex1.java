package class_2021_06_28;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double rate = 1216;
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요.");
		int won = sc.nextInt();
		double dal = won /rate;
		System.out.print(won + "원은"+ "$");
		System.out.printf("%.2f",dal);
		System.out.print("입니다.");		
		

	}

}

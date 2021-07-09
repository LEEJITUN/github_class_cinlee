package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.println("금액을 입력하시오 >> ");

		int mon = sc.nextInt();
		
		for(int i : unit) {
			if(mon/i != 0) {				
				System.out.println(i + "원 짜리 : " + (mon/i) + "개");
			}
			mon %= i;
		}
	}
}

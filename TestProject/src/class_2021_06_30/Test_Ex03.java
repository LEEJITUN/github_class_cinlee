package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("정수를 입력하시오 >> ");
		int num = sc.nextInt();	
		
		if(num < 0) {
			System.out.println("양수 입력 바람");
			sc.close();
			return;
		}
		
		for(int i =0; i< num; num--) {
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}

}

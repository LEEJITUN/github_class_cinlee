package class_2021_06_28;

import java.util.Scanner;

public class EX02_11_MultileOfTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하시오." );
		int number = in.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else{			
			System.out.println("3의 배수가 아닙니다");
		}

	}

}

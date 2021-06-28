package class_2021_06_28;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.println("2자리수 정수 입력(10~99) >>");
		int num = sc.nextInt();

		if(9 < num && num < 100) {
			if(num /10 == num %10) {
				str = "정답";
			}else {
				str= "실패";
			}	
		}else {
			str = "2자리수의 정수를 입력해주세요.";		
		}
		System.out.println(str);
	}

}

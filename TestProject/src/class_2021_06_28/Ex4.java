package class_2021_06_28;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력 >>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int resultNum;
		
	
		
		if(num1 > num2) {
			resultNum = (num1 > num3? 0 :num1);
			if(resultNum == 0) {
				resultNum = (num2>num3 ? num2 : num3);
			}
		}else{
			resultNum = (num2 > num3? 0 :num2);
			if(resultNum == 0) {
				resultNum = (num1>num3 ? num1 : num3);
			}
		}
		
		System.out.println("중간 값은 "  + resultNum);
	}

}

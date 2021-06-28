package class_2021_06_28;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산 >> ");
		
		int num1 = sc.nextInt();
		String p = sc.next();
		int num2 = sc.nextInt();
		int resultNum = 0;
		//boolean flag = true;
		
		switch(p) {
		case "+" :
			resultNum = num1+num2;
 			System.out.println(num1+p+num2+"의 계산 결과는 " + resultNum);
			break;
		case "-" :
			resultNum = num1-num2;
 			System.out.println(num1+p+num2+"의 계산 결과는 " + resultNum);
			break;
		case "*" :
			resultNum = num1*num2;
 			System.out.println(num1+p+num2+"의 계산 결과는 " + resultNum);
			break;
		case "/"  :
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				//flag = false;
			}else {				
				resultNum = num1/num2;
	 			System.out.println(num1+p+num2+"의 계산 결과는 " + resultNum);
			}
			break;
		default: System.out.println("연산자를 제대로 입력하세요.");
		}
		
		
//		if(p.equals("+")) {
//			resultNum = num1+num2;
//		}else if(p.equals("-")) {
//			resultNum = num1-num2;
//		}else if(p.equals("*")) {
//			resultNum = num1*num2;
//		}else if(p.equals("/")) {
//			if(num2 == 0 ) {				
//				System.out.println("0으로 나눌 수 없습니다.");
//				flag = false;
//			}else {
//				resultNum = num1/num2;				
//			}
//		}else {
//			System.out.println("연산자를 제대로 입력하세요.");
//		}
//		
//		if(flag) {	
//			System.out.println(num1+p+num2+"의 계산 결과는 " + resultNum);
//		}

	}

}

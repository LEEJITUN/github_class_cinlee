package class_2021_06_28;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� >> ");
		
		int num1 = sc.nextInt();
		String p = sc.next();
		int num2 = sc.nextInt();
		int resultNum = 0;
		//boolean flag = true;
		
		switch(p) {
		case "+" :
			resultNum = num1+num2;
 			System.out.println(num1+p+num2+"�� ��� ����� " + resultNum);
			break;
		case "-" :
			resultNum = num1-num2;
 			System.out.println(num1+p+num2+"�� ��� ����� " + resultNum);
			break;
		case "*" :
			resultNum = num1*num2;
 			System.out.println(num1+p+num2+"�� ��� ����� " + resultNum);
			break;
		case "/"  :
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				//flag = false;
			}else {				
				resultNum = num1/num2;
	 			System.out.println(num1+p+num2+"�� ��� ����� " + resultNum);
			}
			break;
		default: System.out.println("�����ڸ� ����� �Է��ϼ���.");
		}
		
		
//		if(p.equals("+")) {
//			resultNum = num1+num2;
//		}else if(p.equals("-")) {
//			resultNum = num1-num2;
//		}else if(p.equals("*")) {
//			resultNum = num1*num2;
//		}else if(p.equals("/")) {
//			if(num2 == 0 ) {				
//				System.out.println("0���� ���� �� �����ϴ�.");
//				flag = false;
//			}else {
//				resultNum = num1/num2;				
//			}
//		}else {
//			System.out.println("�����ڸ� ����� �Է��ϼ���.");
//		}
//		
//		if(flag) {	
//			System.out.println(num1+p+num2+"�� ��� ����� " + resultNum);
//		}

	}

}

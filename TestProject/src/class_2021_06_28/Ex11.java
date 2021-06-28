package class_2021_06_28;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
//		
//		switch(month) {
//		case 12:
//		case 1:
//		case 2:
//		System.out.println("겨울");
//		break;
//		case 3:
//		case 4:
//		case 5:
//		System.out.println("봄");
//		break;	
//		case 6:
//		case 7:
//		case 8:
//		System.out.println("여름");
//		break;
//		case 9:
//		case 10:
//		case 11:
//		System.out.println("가을");
//		break;
//		default: System.out.println("0이 아닌 숫자를 입력해주세요.");
//		}
		
		if(month > 0 ) {
			if(month > 2 && month < 6) {
				System.out.println("봄");
			}else if(month > 5 && month < 9) {
				System.out.println("여름");			
			}else if(month > 8 && month < 12){
				System.out.println("가을");
			}else {
				System.out.println("겨울");
			}
		}else {
			System.out.println("0이 아닌 숫자를 입력해주세요.");
		}
	}

}

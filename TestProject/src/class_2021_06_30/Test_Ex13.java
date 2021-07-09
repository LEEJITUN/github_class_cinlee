package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		
		while(true) {
			inputNum = sc.nextInt();
			// -1 입력시 실행 종료
			if(inputNum == -1) {
				break;
			}
			
			// 100 보다 작을 때 
			if(inputNum < 100) {
				if(inputNum % 3 == 0) {
					System.out.println(inputNum + " 박수 짝짝");
				}else {
					System.out.println(inputNum + " 박수 짝");
				}
			}else {
				// 100이상 일때 
				if(inputNum>=100){					
					System.out.println("입력하신 숫자는 100이상입니다.\n 다시 입력해주세요");
				}
			}
		}
		
		
	}
}

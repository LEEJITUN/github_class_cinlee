package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		
		while(true) {
			inputNum = sc.nextInt();
			// -1 �Է½� ���� ����
			if(inputNum == -1) {
				break;
			}
			
			// 100 ���� ���� �� 
			if(inputNum < 100) {
				if(inputNum % 3 == 0) {
					System.out.println(inputNum + " �ڼ� ¦¦");
				}else {
					System.out.println(inputNum + " �ڼ� ¦");
				}
			}else {
				// 100�̻� �϶� 
				if(inputNum>=100){					
					System.out.println("�Է��Ͻ� ���ڴ� 100�̻��Դϴ�.\n �ٽ� �Է����ּ���");
				}
			}
		}
		
		
	}
}

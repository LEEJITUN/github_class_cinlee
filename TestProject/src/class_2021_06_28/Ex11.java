package class_2021_06_28;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();
//		
//		switch(month) {
//		case 12:
//		case 1:
//		case 2:
//		System.out.println("�ܿ�");
//		break;
//		case 3:
//		case 4:
//		case 5:
//		System.out.println("��");
//		break;	
//		case 6:
//		case 7:
//		case 8:
//		System.out.println("����");
//		break;
//		case 9:
//		case 10:
//		case 11:
//		System.out.println("����");
//		break;
//		default: System.out.println("0�� �ƴ� ���ڸ� �Է����ּ���.");
//		}
		
		if(month > 0 ) {
			if(month > 2 && month < 6) {
				System.out.println("��");
			}else if(month > 5 && month < 9) {
				System.out.println("����");			
			}else if(month > 8 && month < 12){
				System.out.println("����");
			}else {
				System.out.println("�ܿ�");
			}
		}else {
			System.out.println("0�� �ƴ� ���ڸ� �Է����ּ���.");
		}
	}

}

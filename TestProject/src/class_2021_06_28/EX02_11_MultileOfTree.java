package class_2021_06_28;

import java.util.Scanner;

public class EX02_11_MultileOfTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�." );
		int number = in.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3�� ����Դϴ�");
		}else{			
			System.out.println("3�� ����� �ƴմϴ�");
		}

	}

}

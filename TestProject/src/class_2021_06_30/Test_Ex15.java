package class_2021_06_30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Ex15 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
			System.out.println("���ϰ��� �ϴ� �� �� �Է� >> ");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				
				return;
			} catch (InputMismatchException e) {
				sc.next();
			}
		}	
	}
}

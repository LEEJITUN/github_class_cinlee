package class_2021_06_30;

import java.util.Scanner;

public class Ex06_BreakExaple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		while(true) {
			if(sc.nextInt() == -1) {
				break;
			}
			num++;
		}
		System.out.println("입력된 숫자 개수는" + num);
	}
	


}

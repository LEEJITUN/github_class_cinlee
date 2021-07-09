package class_2021_06_30;

import java.util.Scanner;

public class EX07_ArrayAcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		
		for(int i =0; i < 5; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max +"입니다.");
	}
}

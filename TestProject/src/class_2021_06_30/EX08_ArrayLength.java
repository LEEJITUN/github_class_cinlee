package class_2021_06_30;

import java.util.Scanner;

public class EX08_ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		double sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("배열 원소의 평균은" + sum/intArray.length + "입니다");
	}

}

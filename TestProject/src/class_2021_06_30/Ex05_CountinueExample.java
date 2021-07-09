package class_2021_06_30;

import java.util.Scanner;

public class Ex05_CountinueExample {

	public static void main(String[] args) {

		int sum =0;
		
		for(int i=1; i<=100; i++){
			if(i%2 == 1) {
				continue;
			}else {
				sum+=i;
			}
			
		}
		System.out.println("1부터 100까지 짝수의 합은" +sum);
	}

}

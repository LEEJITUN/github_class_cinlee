package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex07 {
	public static void main(String[] args) {
		int Array[] = new int[10];
		int sum = 0;
		double resualt;
		
		for(int j =0; j <Array.length; j++) {
			Array[j] = (int)(Math.random()*10+1);
		}

		System.out.print("·£´ýÇÑ Á¤¼öµé: ");
		for(int j =0; j <Array.length; j++) {
			System.out.print(Array[j]+" ");
			sum +=Array[j];
		}
		resualt = sum/10.0;
		System.out.printf("\nÆò±ÕÀº %.1f" , resualt);
	}
	
}

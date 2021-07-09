package class_2021_06_30;

import java.util.Scanner;

public class Ex02_WhileSample {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char) (a+1);
		}while(a<'z');
		

	}

}

package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[10];
		
		System.out.print("���� ������ 10�� �Է��Ͻÿ� >> ");
		
		for (int i=0; i<Array.length; i++ ) {
			Array[i] = sc.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int j=0; j<Array.length; j++ ) {
			if(Array[j] % 3 == 0) {
				System.out.print(Array[j]+ " ");
			}
		}	
		
	}
}

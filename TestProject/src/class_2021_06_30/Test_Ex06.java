package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");

		int mon = sc.nextInt();
		
		for(int i : unit) {
			if(mon/i != 0) {				
				System.out.println(i + "�� ¥�� : " + (mon/i) + "��");
			}
			mon %= i;
		}
	}
}

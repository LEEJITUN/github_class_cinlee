package class_2021_06_28;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름 입력 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		float rat = sc.nextFloat();
		
		System.out.println("점 입력 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if((x2 - x1) <= rat ){
			System.out.println("점 ("+ x2 + "," + y2 + ")는 원 안에 있다.");
		}else {
			System.out.println("점 ("+ x2 + "," + y2 + ")는 원 안에 있지 않다.");			
		}

	}

}

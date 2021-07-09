package class_2021_06_28;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름 입력 >> ");
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double rad = sc.nextFloat();
		
		System.out.println("점 입력 >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextInt();
		
		double dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		if(dist <= rad ){
			System.out.println("점 ("+ x2 + "," + y2 + ")는 원 안에 있다.");
		}else {
			System.out.println("점 ("+ x2 + "," + y2 + ")는 원 안에 있지 않다.");			
		}
		sc.close();
	}

}

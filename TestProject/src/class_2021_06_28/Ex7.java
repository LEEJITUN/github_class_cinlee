package class_2021_06_28;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오 >> ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x > 101 && x < 201) && (y > 101 && y < 201)) {
			System.out.println("(" +x+"," + y + ") 는 사각형 안에 있습니다." );
		}else {
			System.out.println("(" +x+"," + y + ") 는 사각형 안에 있지 않습니다.");
		}
		
		
	}
}

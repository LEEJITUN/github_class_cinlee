package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"JAVA","C++","HTML5","컴퓨터 구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		boolean flag = false;
		
		while(true) {			
			System.out.println("과목이름은 >> ");
			String str = sc.next();
			
			// 그만을 입력하면 종료
			if(str.equals("그만")) {
				System.out.println("종료되었습니다.");
				return; // 함수종료
			}
			
			// 비교 
			for(int i = 0 ; i< course.length; i++) {
				// 과목이 있을 경우 flag = true;
				if(course[i].equals(str)) {
					flag =  true; 
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break; // 루프문 빠져나감 
				}
			}
			
			// 과목이 있는지 없는지 출력
			if(!flag) {
				System.out.println("없는 과목입니다.");
			}
			// flag값 초기화 
			flag = false;	
		}
	}
}

package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex16 {
	static String STR[] = {"가위","바위","보"};
	// 0 = 비긴, 1 = 이긴 2 = 진
	static int[] NUMBER =new int[3];
	public static void str(String userNum, int compNum, int result) {
			if(result == 1) {			
				System.out.println("사용자 = " + userNum +", 컴퓨터 = " + STR[compNum] + " 사용자가 이겼습니다.");
				NUMBER[1] ++;
			}else if(result == 2) {
				System.out.println("사용자 = " + userNum +", 컴퓨터 = " + STR[compNum] + " 컴퓨터가 이겼습니다.");
				NUMBER[2] ++;
			}else if(result == 0) {
				System.out.println("사용자 = " + userNum +", 컴퓨터 = " + STR[compNum] + " 비겼습니다.");
				NUMBER[0] ++;
			}
	}

	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("*****************************");
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.println("*****************************");
		
		while(true) {
			
			System.out.println("가위 바위 보! >> ");
			n = (int)(Math.random()*3);			
			String userStr = sc.nextLine();
			
			// 멈춤
			if(userStr.equals("그만")) {
				System.out.println("*****************************");
				System.out.println("THE END");
				System.out.println("비긴 횟수" + NUMBER[0]+"\n이긴 횟수" + NUMBER[1]+"\n진 횟수" + NUMBER[2] );
				System.out.println("*****************************");				
				break;
			}
			
				switch(userStr) {
					case "가위" : 
						if(n == 0) {// 비김
							str(STR[0],n,0);
						}else if(n == 1){// 가위 <-> 바위 => 짐
							str(STR[0],n,2); 
						}else if(n == 2) { // 가위 <-> 보 => 이김
							str(STR[0],n,1); 
						}
						break;
					case "바위":
						if(n == 0) {// 바위 <-> 가위= > 이김
							str(STR[1],n,1);
						}else if(n == 1){	// 비김
							str(STR[1],n,0);
						}else if(n == 2) { // 바위 <->보 => 짐 
							str(STR[1],n,2); 
						}
						break;
					case "보":
						if(n == 0) {//보 <-> 가위 => 짐
							str(STR[2],n,2);
						}else if(n == 1){// 보 <-> 바위 => 이김
							str(STR[2],n,1);
						}else if(n == 2) { // 비김
							str(STR[2],n,0); 
						}
						break;
					default: System.out.println("'가위','바위','보'의 단어만 입력하세요.");
			}
		}
	}
}

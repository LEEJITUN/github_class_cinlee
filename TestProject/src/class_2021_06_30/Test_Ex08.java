package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 몇개?");
		
		int num = sc.nextInt();
		int Array[] = new int[num];
		int cnt = 0;
			
		
		if(num > 100) {
			System.out.println("100보다 작은 갯수를 입력하세요.");
			return;
		}
			
			//2.랜덤수 10개를 배열에 담는다. 반복문을 통해서
			for(int i=0; i<Array.length; ++i) {
				int saveNum = (int)(Math.random()*100+1);

				//체크방법1: 이미 배열 안에 들어가 있는지 검사
				for(int j=0; j<i;++j)
				{
					if(saveNum == Array[j])//이미 있으면, 중복처리
					{
						i--;
						break;
					}
					Array[i] = saveNum;
				}
				
			}

			
			// Array값을 출력
			for (int i : Array) {
				System.out.print(i + " ");
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println();
				}
			} 
		}
		


		
	
}

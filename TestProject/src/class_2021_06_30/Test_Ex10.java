package class_2021_06_30;

public class Test_Ex10 {
	
	public static void ex(int[][] Array,int num) {
		int cnt = 0;
		
		for(int i = 0; i<Array.length; i++) {
			for(int j = 0; j< Array[i].length; j++) {
				/*스위치*/
				switch(num) {
				case 1:
					Array[i][j] =(int)(Math.random()*10+1);
					break;
				case 2: 
					if((j == 0 || j == 3) && cnt<6) {					
						Array[i][j] = 0;
						cnt ++;
					}
					break;
				case 3: 
					System.out.print(Array[i][j] + "\t");
					break;
				}
				/* for문 */
//				if(num == 1) {					
//					Array[i][j] =(int)(Math.random()*10+1);
//				}else if(num == 2) {
//					if((j == 0 || j == 3) && cnt<6) {					
//						Array[i][j] = 0;
//						cnt ++;
//					}
//				}else {
//					System.out.print(Array[i][j] + "\t");
//				}
			}
			if(num == 3) {
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args) {
		int [][] Array = new int[4][4];
		// 메소드 사용
		ex(Array,1);
		ex(Array,2);
		ex(Array,3);
		
		
		/*메소드 사용X*/
//		// 저장하는 for문
//		for(int i = 0; i<Array.length; i++) {
//			for(int j = 0; j< Array[i].length; j++) {				
//				Array[i][j] =(int)(Math.random()*10+1);
//			}
//		}
//		
//		// 임의로 Array에 0삽입 (첫번째와 끝자리 0)
//		for(int i = 0; i<Array.length; i++) {
//			for(int j = 0; j< Array[i].length; j++) {	
//				if((j == 0 || j == 3) && cnt<6) {					
//					Array[i][j] = 0;
//					cnt ++;
//				}
//			}
//		}
//		
//		// 출력 for문
//		for(int i = 0; i<Array.length; i++) {
//			for(int j = 0; j< Array[i].length; j++) {	
//				System.out.print(Array[i][j] + "\t");
//			}
//			System.out.println("");
//		}
		
		
	}
}

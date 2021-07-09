package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		char st = sc.nextLine().charAt(0);
		
		int num = (char) st;
		int cnt = num - 97;
		
		
	      
	      for(char i=st; i>='a'; i--) {
	          for(char j='a'; j<=i; j++) {
	             System.out.print(j);
	          }
	          System.out.println();
	       }

//		for(int i=0; i <= cnt; i++ ) {
//			for(int j = cnt-i;  0 < j+1  && j < num; j-- ){
//				int newNum = num -j;
//				System.out.print((char)newNum);
//			}
//			num --;
//			System.out.println("");
//		}
	}

}

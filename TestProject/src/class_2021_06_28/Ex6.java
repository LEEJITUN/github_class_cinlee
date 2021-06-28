package class_2021_06_28;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À >> ");
		
		int num = sc.nextInt();
		
		if(1< num && num > 100) {
			
			if(num < 10 ) {
				if((num % 3 == 0)) {
					System.out.println("¹Ú¼öÂ¦");
				}
			}else {			
				if((num % 3 == 0) && ((num % 10 == 3) || (num % 10 == 6) || (num % 10 == 9))) {
					System.out.println("¹Ú¼öÂ¦Â¦");							
				}else if((num % 10 == 3) || (num % 10 == 6) || (num % 10 == 9)) {
					System.out.println("¹Ú¼öÂ¦");				
				}else if((num % 30 == 0)) {
					System.out.println("¹Ú¼öÂ¦");
				}
			}

		}
	}

}

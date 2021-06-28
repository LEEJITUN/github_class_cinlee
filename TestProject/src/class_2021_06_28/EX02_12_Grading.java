package class_2021_06_28;

import java.util.Scanner;

public class EX02_12_Grading {

	public static void main(String[] args) {
		
		char grad;
		Scanner a = new Scanner(System.in);
		
		while(a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90) {
				grad = 'A';
			}else if(score >= 80) {
				grad = 'B';				
			}else if(score >= 70) {
				grad = 'C';
			}else if(score >= 60) {
				grad = 'D';
			}else{
				grad = 'F';
			}
			
			System.out.println("학점은" +grad +"입니다");
			
		}
		

	}

}

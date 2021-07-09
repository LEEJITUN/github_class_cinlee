package class_2021_06_30;

import java.util.Scanner;

public class Test1 {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	      int score [] = {95, 88, 76, 62, 55};
	      boolean flag = false;
	      
	      while(true) {
	         System.out.print("과목 이름 : ");
	         String subject = sc.next();
	         
	         if(subject.equals("그만")) {
	            break;
	         }
	         else {
	            for(int i=0; i<course.length; i++) {
	            	
	               if(course[i].equals(subject)) {
	                  System.out.println(course[i] + "의 점수는 " + score[i]);
	                  flag = true;
	                  break;
	               }
	               
	               if(!flag){
	                  System.out.println("없는 과목입니다.");
	               }
	            }
	         }
	      }
	 }
}



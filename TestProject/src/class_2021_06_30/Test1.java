package class_2021_06_30;

import java.util.Scanner;

public class Test1 {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	      int score [] = {95, 88, 76, 62, 55};
	      boolean flag = false;
	      
	      while(true) {
	         System.out.print("���� �̸� : ");
	         String subject = sc.next();
	         
	         if(subject.equals("�׸�")) {
	            break;
	         }
	         else {
	            for(int i=0; i<course.length; i++) {
	            	
	               if(course[i].equals(subject)) {
	                  System.out.println(course[i] + "�� ������ " + score[i]);
	                  flag = true;
	                  break;
	               }
	               
	               if(!flag){
	                  System.out.println("���� �����Դϴ�.");
	               }
	            }
	         }
	      }
	 }
}



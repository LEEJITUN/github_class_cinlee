package class_2021_07_02;

import java.util.Scanner;

public class TEST3 {
	 public static void main(String[] args) {
		   /*
	      char grade = 'C';
	      switch (grade) {
	         case 'A':
	         case 'B':
	            System.out.println("�� ���Ͽ����ϴ�.");
	            break;
	         case 'C':
	         case 'D':
	            System.out.println("�� �� ����ϼ���");
	            break;
	         case 'F':
	            System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
	            break;
	         default:
	            System.out.println("�߸��� �����Դϴ�.");
	         }
	   */
	      Scanner sc = new Scanner(System.in);
	   
	      //String grade;
	      System.out.print("������ �����Դϱ�? ");
	      String grade = sc.next();
	      
	      switch (grade) {
	         case "A":
	         case "B":
	            System.out.println("�� ���Ͽ����ϴ�.");
	            break;
	         case "C":
	         case "D":
	            System.out.println("�� �� ����ϼ���");
	            break;
	         case "F":
	            System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
	            break;
	         default:
	            System.out.println("�߸��� �����Դϴ�.");
	      
	      }
	 

         
         
   }

}

package class_2021_07_02;

public class Test2 {
   // a�޼ҵ�

   
   public static void main(String[] args) {
	   
	  double sum = 0.0;
	  
	  for(int i = 0; i<args.length; i++) {
		  sum+= Double.parseDouble(args[i]);
		  System.out.println("�հ�: " + sum);
		  System.out.println("���: " + sum);
	  }


	   
   }

}

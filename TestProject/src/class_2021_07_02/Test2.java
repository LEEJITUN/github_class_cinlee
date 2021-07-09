package class_2021_07_02;

public class Test2 {
   // a메소드

   
   public static void main(String[] args) {
	   
	  double sum = 0.0;
	  
	  for(int i = 0; i<args.length; i++) {
		  sum+= Double.parseDouble(args[i]);
		  System.out.println("합계: " + sum);
		  System.out.println("평균: " + sum);
	  }


	   
   }

}

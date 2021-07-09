package class_2021_06_30;

public class Test_Ex11 {
	
   public static void main(String[] args) {
	      int sum = 0;
	      
	      for(int i=0; i<args.length; i++) {
	         sum += Integer.parseInt(args[i]);
	      }
	      System.out.println(sum/args.length);
   }
}

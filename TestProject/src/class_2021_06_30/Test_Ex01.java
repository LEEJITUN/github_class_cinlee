package class_2021_06_30;

public class Test_Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		
//		while(i < 100) {
//			sum+=i;
//			i+=2;
//		}
		for(i = 0; i < 100; i+=2) {
			sum +=i;
		}
		System.out.println(sum);
		
	}

}

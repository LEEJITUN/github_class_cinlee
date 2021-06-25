package class_2021_06_25;

public class Test1 {
    // 내가 만든 프로그램의 시작점(entry point)
	public static void main(String[] args) {
	
	 Test2 t1 = new Test2();
	 Test2 t2 = new Test2();
	 Test2 t3 = new Test2();
	 
	 
	 int a = t1.a1;

	 System.out.println(a);
	 System.out.println(a);
	 System.out.println(a);
	 System.out.println(a);
	 System.out.println(print1(1,2));
	}
	
	static int print1(int x, int y){
		int z = x+y;
	//	System.out.println("x+y =" +z);
		
		return z;
    }

}

package class_2021_07_02;

public class Test1 {
	
	   
	   //1. in 없음, out 없음
	   static void method01() {
	      System.out.print("안녕 ");
	      System.out.println("반갑습니다");
	   }
	   
	   //2. in 있음. out 없음
	   static void method02(int a, int b) {
	      int c = a+b;
	      System.out.println("더한 결과 " + c);
	   }
	   
	   //3.in 없음 out 있음
	   static int method03() {
	      int c = 100;
	      return c;   
	   }
	   
	   //4. in 있음, out 있음
	   static int method04(int a, int b) {
	      int c = a+b;
	      return c;
	   }
	   
	   //5. 배열(주소의 값을 저장)을 in으로 사용
	   static void method05(int[] arr1) {
	      
	      arr1[0] = arr1[0] + 15;
	      System.out.println("메소드arr1[0]-->"+arr1[0]);
	   }
	   
	   //6.
	   static void method06(int g) {
	      g = g + 11;
	      System.out.println("메소드ggg --> " + g );
	   }
	   
	   public static void main(String[] args) {
	      
	      method01(); //그냥 출력값만 나옴

	      method02(3,4); 
	      
	      int x=10, y=32;
	      method02(x,y);
	      
	      //int e = method01(); 이렇게 하면 안된다!
	      
	      int f = method04(200, 300);
	      System.out.println("f=="+f);
	      
	      System.out.println(method04(20, 50));
	      
	      //메소드의 in -> parameter(파라미터), 매개변수, 매개인자, 인자, 인수
	      
	      int arr1[] = new int[3];
	      arr1[0] = 11;
	      arr1[1] = 23;
	      
	      method05(arr1);
	      
	      //arr1[0] 바꼈는지 확인?
	      System.out.println("-->"+arr1[0]); 
	      
	      int g = 10;
	      method06(g);
	      System.out.println("메인g-->" + g);
	      
	      //call by value : int와 같은 기본 자료형
	      //call by reference : 배열, 객체 new
	   }

   }


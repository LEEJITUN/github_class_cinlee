package class_2021_07_02;

public class Test1 {
	
	   
	   //1. in ����, out ����
	   static void method01() {
	      System.out.print("�ȳ� ");
	      System.out.println("�ݰ����ϴ�");
	   }
	   
	   //2. in ����. out ����
	   static void method02(int a, int b) {
	      int c = a+b;
	      System.out.println("���� ��� " + c);
	   }
	   
	   //3.in ���� out ����
	   static int method03() {
	      int c = 100;
	      return c;   
	   }
	   
	   //4. in ����, out ����
	   static int method04(int a, int b) {
	      int c = a+b;
	      return c;
	   }
	   
	   //5. �迭(�ּ��� ���� ����)�� in���� ���
	   static void method05(int[] arr1) {
	      
	      arr1[0] = arr1[0] + 15;
	      System.out.println("�޼ҵ�arr1[0]-->"+arr1[0]);
	   }
	   
	   //6.
	   static void method06(int g) {
	      g = g + 11;
	      System.out.println("�޼ҵ�ggg --> " + g );
	   }
	   
	   public static void main(String[] args) {
	      
	      method01(); //�׳� ��°��� ����

	      method02(3,4); 
	      
	      int x=10, y=32;
	      method02(x,y);
	      
	      //int e = method01(); �̷��� �ϸ� �ȵȴ�!
	      
	      int f = method04(200, 300);
	      System.out.println("f=="+f);
	      
	      System.out.println(method04(20, 50));
	      
	      //�޼ҵ��� in -> parameter(�Ķ����), �Ű�����, �Ű�����, ����, �μ�
	      
	      int arr1[] = new int[3];
	      arr1[0] = 11;
	      arr1[1] = 23;
	      
	      method05(arr1);
	      
	      //arr1[0] �ٲ����� Ȯ��?
	      System.out.println("-->"+arr1[0]); 
	      
	      int g = 10;
	      method06(g);
	      System.out.println("����g-->" + g);
	      
	      //call by value : int�� ���� �⺻ �ڷ���
	      //call by reference : �迭, ��ü new
	   }

   }


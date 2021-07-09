package class_2021_07_07;


// 1. 클래스 만들기
class Person{
	
	//만들 때 구성성분 3가지
		//①멤버변수
		private String name;
		private int age;
		private double height;
		
		//②생성자 (메소드)
		public Person(){
			System.out.println("나는 생성자!");
		}
		
		//③메소드
		public int addAge1(int plus){
			age = age + plus;
			return age;
		}
		
		public void addAge2(int plus){
			age = age + plus;
		}
		
		public String getName(){
			return name;
		}
		
		public int getAge(){
			return age;
		}
		
		public void setName(String name1){
			name = name1;
		}
		
		public void setAge(int age1){
			age = age1;
			printAge();
		}
		
		private void printAge(){
			System.out.println("객체 나이 출력->"+age);
		}
	
}

public class Ex04_Test {
	
	public static void main(String[] args) {

		//2.클래스 사용, 3.객체 만들기
		Person p1 = new Person();
		
		//4.객체 사용(①멤버변수 or ②메소드)
		//①멤버변수
//		p1.name = "홍길동";//멤버변수 접근 금지
//		p1.age = 20;//멤버변수 접근 금지
		p1.setName("홍길동");
		p1.setAge(20);
		
		//System.out.println(p1.name +"의 나이는"+p1.age);
		System.out.println(p1.getName() +"의 나이는"+p1.getAge());
		
		//②메소드
		int realAge1 = p1.addAge1(3);
		System.out.println("진짜 나이는=>"+realAge1);

		p1.addAge2(5);
//		System.out.println("진짜 나이는=>"+p1.age);//멤변 접근 금지
		System.out.println("진짜 나이는=>"+p1.getAge());
	}

}
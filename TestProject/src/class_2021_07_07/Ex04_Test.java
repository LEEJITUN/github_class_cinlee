package class_2021_07_07;


// 1. Ŭ���� �����
class Person{
	
	//���� �� �������� 3����
		//��������
		private String name;
		private int age;
		private double height;
		
		//������� (�޼ҵ�)
		public Person(){
			System.out.println("���� ������!");
		}
		
		//��޼ҵ�
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
			System.out.println("��ü ���� ���->"+age);
		}
	
}

public class Ex04_Test {
	
	public static void main(String[] args) {

		//2.Ŭ���� ���, 3.��ü �����
		Person p1 = new Person();
		
		//4.��ü ���(�������� or ��޼ҵ�)
		//��������
//		p1.name = "ȫ�浿";//������� ���� ����
//		p1.age = 20;//������� ���� ����
		p1.setName("ȫ�浿");
		p1.setAge(20);
		
		//System.out.println(p1.name +"�� ���̴�"+p1.age);
		System.out.println(p1.getName() +"�� ���̴�"+p1.getAge());
		
		//��޼ҵ�
		int realAge1 = p1.addAge1(3);
		System.out.println("��¥ ���̴�=>"+realAge1);

		p1.addAge2(5);
//		System.out.println("��¥ ���̴�=>"+p1.age);//�⺯ ���� ����
		System.out.println("��¥ ���̴�=>"+p1.getAge());
	}

}
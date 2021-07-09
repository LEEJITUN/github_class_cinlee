package class_2021_06_30;


public class EX09_ForeachEx {
	// enum ������ - > JAVA 1.5���� ����
	// final static String, int�� ���� ���ڿ��̳� ���ڵ��� ��Ÿ���� �⺻�ڷ����� ���� Enum���� ��ü�ؼ� ��밡��
	enum Week {��,ȭ,��,��,��,��,��}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		int sum = 0;
		
		for(int k : num) {
			sum+=k;
		}
		System.out.println("����" + sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day:Week.values()) {
			System.out.print(day + "���� ");
		}
		System.out.println();
	}
	

}

package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"JAVA","C++","HTML5","��ǻ�� ����","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		boolean flag = false;
		
		while(true) {			
			System.out.println("�����̸��� >> ");
			String str = sc.next();
			
			// �׸��� �Է��ϸ� ����
			if(str.equals("�׸�")) {
				System.out.println("����Ǿ����ϴ�.");
				return; // �Լ�����
			}
			
			// �� 
			for(int i = 0 ; i< course.length; i++) {
				// ������ ���� ��� flag = true;
				if(course[i].equals(str)) {
					flag =  true; 
					System.out.println(course[i] + "�� ������ " + score[i]);
					break; // ������ �������� 
				}
			}
			
			// ������ �ִ��� ������ ���
			if(!flag) {
				System.out.println("���� �����Դϴ�.");
			}
			// flag�� �ʱ�ȭ 
			flag = false;	
		}
	}
}

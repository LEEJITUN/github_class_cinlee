package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �?");
		
		int num = sc.nextInt();
		int Array[] = new int[num];
		int cnt = 0;
			
		
		if(num > 100) {
			System.out.println("100���� ���� ������ �Է��ϼ���.");
			return;
		}
			
			//2.������ 10���� �迭�� ��´�. �ݺ����� ���ؼ�
			for(int i=0; i<Array.length; ++i) {
				int saveNum = (int)(Math.random()*100+1);

				//üũ���1: �̹� �迭 �ȿ� �� �ִ��� �˻�
				for(int j=0; j<i;++j)
				{
					if(saveNum == Array[j])//�̹� ������, �ߺ�ó��
					{
						i--;
						break;
					}
					Array[i] = saveNum;
				}
				
			}

			
			// Array���� ���
			for (int i : Array) {
				System.out.print(i + " ");
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println();
				}
			} 
		}
		


		
	
}

package class_2021_06_30;

import java.util.Scanner;

public class Test_Ex16 {
	static String STR[] = {"����","����","��"};
	// 0 = ���, 1 = �̱� 2 = ��
	static int[] NUMBER =new int[3];
	public static void str(String userNum, int compNum, int result) {
			if(result == 1) {			
				System.out.println("����� = " + userNum +", ��ǻ�� = " + STR[compNum] + " ����ڰ� �̰���ϴ�.");
				NUMBER[1] ++;
			}else if(result == 2) {
				System.out.println("����� = " + userNum +", ��ǻ�� = " + STR[compNum] + " ��ǻ�Ͱ� �̰���ϴ�.");
				NUMBER[2] ++;
			}else if(result == 0) {
				System.out.println("����� = " + userNum +", ��ǻ�� = " + STR[compNum] + " �����ϴ�.");
				NUMBER[0] ++;
			}
	}

	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("*****************************");
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.println("*****************************");
		
		while(true) {
			
			System.out.println("���� ���� ��! >> ");
			n = (int)(Math.random()*3);			
			String userStr = sc.nextLine();
			
			// ����
			if(userStr.equals("�׸�")) {
				System.out.println("*****************************");
				System.out.println("THE END");
				System.out.println("��� Ƚ��" + NUMBER[0]+"\n�̱� Ƚ��" + NUMBER[1]+"\n�� Ƚ��" + NUMBER[2] );
				System.out.println("*****************************");				
				break;
			}
			
				switch(userStr) {
					case "����" : 
						if(n == 0) {// ���
							str(STR[0],n,0);
						}else if(n == 1){// ���� <-> ���� => ��
							str(STR[0],n,2); 
						}else if(n == 2) { // ���� <-> �� => �̱�
							str(STR[0],n,1); 
						}
						break;
					case "����":
						if(n == 0) {// ���� <-> ����= > �̱�
							str(STR[1],n,1);
						}else if(n == 1){	// ���
							str(STR[1],n,0);
						}else if(n == 2) { // ���� <->�� => �� 
							str(STR[1],n,2); 
						}
						break;
					case "��":
						if(n == 0) {//�� <-> ���� => ��
							str(STR[2],n,2);
						}else if(n == 1){// �� <-> ���� => �̱�
							str(STR[2],n,1);
						}else if(n == 2) { // ���
							str(STR[2],n,0); 
						}
						break;
					default: System.out.println("'����','����','��'�� �ܾ �Է��ϼ���.");
			}
		}
	}
}

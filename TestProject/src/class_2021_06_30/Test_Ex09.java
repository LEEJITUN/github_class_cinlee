package class_2021_06_30;

public class Test_Ex09 {
	
	// Array���� �����ϴ� �޼ҵ�
	public static void save(int[][] Array) {
		for(int i = 0; i<Array.length; i++) {
			for(int j = 0; j< Array[i].length; j++) {				
				Array[i][j] =(int)(Math.random()*10+1);
			}
		}
	}
	// Array���� ����ϴ� �޼ҵ�
	public static void print(int[][] Array) {
		// ����ϴ� for��
		for(int i = 0; i<Array.length; i++) {
			for(int j = 0; j< Array[i].length; j++) {				
				System.out.print(Array[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int [][] Array = new int[4][4];
		
		save(Array);
		print(Array);
	}
}

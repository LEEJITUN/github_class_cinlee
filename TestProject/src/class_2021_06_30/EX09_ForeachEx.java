package class_2021_06_30;


public class EX09_ForeachEx {
	// enum 열거형 - > JAVA 1.5부터 지원
	// final static String, int와 같이 문자열이나 숫자들을 나타내는 기본자료형의 값을 Enum으로 대체해서 사용가능
	enum Week {월,화,수,목,금,토,일}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for(int k : num) {
			sum+=k;
		}
		System.out.println("합은" + sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day:Week.values()) {
			System.out.print(day + "요일 ");
		}
		System.out.println();
	}
	

}

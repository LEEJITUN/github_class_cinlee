package class_2021_06_28;

public class Ex8 {
	public static void main(String[] args) {
		
	}
	
	public static boolean inReject (int x, int y, int rect_x1, int rect_y1
			, int rect_x2, int rect_y2) {
		
		if((x >= rect_x1 && x <= rect_x2) && (y>=rect_y1 && y<= rect_y2)) {
			return true;
		}else {
				return false;
		}
	}
}
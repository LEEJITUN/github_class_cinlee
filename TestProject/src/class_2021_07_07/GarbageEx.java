package class_2021_07_07;

public class GarbageEx {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Nomal");
		String d;
		String e = null;
		
		a = null;
		d= c;
		c = null;
		System.out.println(e);
	}

}

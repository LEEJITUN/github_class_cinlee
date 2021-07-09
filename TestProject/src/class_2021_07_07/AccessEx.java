package class_2021_07_07;

class Sample {
	private int a;
	private int b;
	private int c;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
}

public class AccessEx {
	public static void main(String[] args) {

		Sample aClass = new Sample();
		aClass.setA(10);
		aClass.setB(10);
		aClass.setC(10);
	}
}

package class_2021_07_07;

public class MyExp {
	private int base;
	private int exp;
	
	
	MyExp(int base, int exp){
		this.base = base;
		this.exp = exp;
	}
	
	int getValue() {
		int res = 1;
		for(int i =0; i <exp; i++) {
			res = res * base;
		}
		return res;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}

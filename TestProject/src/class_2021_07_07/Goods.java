package class_2021_07_07;

public class Goods {
	
	String name;
	int price;
	int number;
	int sold;
	int numberOfStock;

	// �������
	Goods(){};
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	
	public void goodsPrint() {
		System.out.println("---------����1---------");
		System.out.println("��ǰ �̸�: " + this.name);
		System.out.println("��ǰ ����: " + this.price);
		System.out.println("��� ����: " + this.number);
		System.out.println("�ȸ� ����: " + this.sold);
	}
}

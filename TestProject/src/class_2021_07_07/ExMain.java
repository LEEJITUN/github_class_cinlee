package class_2021_07_07;

public class ExMain {

	public static void main(String[] args) {
		// ���� 1��
		Goods camera = new Goods();
		// �� ����
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setNumber(30);
		camera.setSold(50);
		// goods�� ��� �޼ҵ� ���
		camera.goodsPrint();

		
		// ���� 2��
		MyExp number1 = new MyExp(2,3);
		MyExp number2 = new MyExp(3,4);

		System.out.println("---------����2---------");
		System.out.println("2��3���� = " + number1.getValue());
		System.out.println("3��4���� = " + number2.getValue());
	
		
		// ���� 3��	
		GoodArray goodArray = new GoodArray();
		goodArray.goodsPrint();

		
		// ���� 4��
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		System.out.println("---------����3---------");
		ArrayParameter.printCharArray(c);		
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	
		
		// ���� 5��
		Book javaBook = new Book("javaBook", "Ȳ����", 3333);
		System.out.println("---------����5---------");
		System.out.println("title: " + javaBook.title + "\nauthor: " + javaBook.author + "\nISBN: " + javaBook.ISBN);
	}

}

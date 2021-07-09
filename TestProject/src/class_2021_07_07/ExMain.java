package class_2021_07_07;

public class ExMain {

	public static void main(String[] args) {
		// 예제 1번
		Goods camera = new Goods();
		// 값 셋팅
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setNumber(30);
		camera.setSold(50);
		// goods의 출력 메소드 사용
		camera.goodsPrint();

		
		// 예제 2번
		MyExp number1 = new MyExp(2,3);
		MyExp number2 = new MyExp(3,4);

		System.out.println("---------예제2---------");
		System.out.println("2의3승은 = " + number1.getValue());
		System.out.println("3의4승은 = " + number2.getValue());
	
		
		// 예제 3번	
		GoodArray goodArray = new GoodArray();
		goodArray.goodsPrint();

		
		// 예제 4번
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		System.out.println("---------예제3---------");
		ArrayParameter.printCharArray(c);		
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	
		
		// 예제 5번
		Book javaBook = new Book("javaBook", "황기태", 3333);
		System.out.println("---------예제5---------");
		System.out.println("title: " + javaBook.title + "\nauthor: " + javaBook.author + "\nISBN: " + javaBook.ISBN);
	}

}

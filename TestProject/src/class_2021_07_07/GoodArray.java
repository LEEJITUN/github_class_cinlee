package class_2021_07_07;

import java.util.Scanner;

public class GoodArray {
	
	Goods [] goodsArray =  new Goods[3];
	
	// ������
	GoodArray(){					
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է����ּ��� >> ");
		
		for(int i = 0; i<goodsArray.length; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			int n = sc.nextInt();
			int sold = sc.nextInt();
			goodsArray[i] = new Goods(name,price,n,sold);
			
			Goods good = new Goods();
		}
	}
		
	// ����ϴ� �޼ҵ� 	
	public void  goodsPrint(){			
		for(int i = 0; i< goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName()+ " ");
			System.out.print(goodsArray[i].getPrice()+ " ");
			
			System.out.print(goodsArray[i].getNumberOfStock()+ " ");
			System.out.println(goodsArray[i].getSold()+ " ");
		}
	}
		

}

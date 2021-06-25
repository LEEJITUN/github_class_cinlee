package class_2021_06_25;
import java.io.*;
import java.io.InputStreamReader;

public class EX02_03_InputExample {


	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read();

				if(a == -1){
					System.out.println((char)a);
					break;
					
				}
			}
		}catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
	}
}

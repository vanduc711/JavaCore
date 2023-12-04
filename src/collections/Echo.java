package collections;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo biến ten có dạng String
		String ten;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi: ");
		ten = scanner.nextLine();
		System.out.println("Chào mừng bạn đến với " + ten + ".com");
	}

}

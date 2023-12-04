package collections;

import java.util.Scanner;

public class swith_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo ra biến products kiểu int
		int products;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập products bất kỳ (từ 1 đến 3): ");
		products = scanner.nextInt();
		//sử dụng switch case để bắt các case
		switch (products) {
			case 1:
				System.out.println("Car");
				break;
			case 2: 
				System.out.println("Phone");
				break;
			case 3: 
				System.out.println("Food");
				break;
			default:
				System.out.println("sản phẩm bạn chọn không có trong cửa hàng");
		}
	}

}

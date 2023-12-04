package collections;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		//tạo biến priceProduct và đặt giá trị mặc định của totalPrice là 0
		int priceProduct, totalPrice = 0;
		Scanner scanner = new Scanner(System.in);
		//Sử dụng do while kiểm tra nếu tổng đơn hàng lớn hơn 100 yêu cầu thanh toán
		do {
			System.out.println("Nhập giá lần lượt sản phẩm mà bạn chọn: ");
			priceProduct = scanner.nextInt();
			totalPrice += priceProduct;
		} while (totalPrice < 100);
		System.out.println("Tổng hóa đơn của bạn là: " + totalPrice);
	}
}

package collections;

import java.util.Scanner;

public class while_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orderProduct,total = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (total < 100) {
			System.out.println("Nhập số lượng đơn hàng bé hơn 100: ");
			orderProduct = scanner.nextInt();
			total += orderProduct;
		}
		System.out.println("số lượng đơn hàng là:" + total);
	}

}

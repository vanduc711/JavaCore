package collections;

import java.util.Scanner;

public class toantu3ngoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo ra biến number kiểu int
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập một số bất kỳ: ");
		number = scanner.nextInt();
		
		String ketqua = (number % 2 == 0) ? "Số " + number + " là số chẵn" : "Số " + number + " là số lẻ";
		System.out.println(ketqua);

	}

}

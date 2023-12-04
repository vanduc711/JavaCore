package collections;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo ra 2 biến lưu kiểu số nguyên
		int firstNumber, secondNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số đầu tiên: ");
		firstNumber = scanner.nextInt();
		System.out.println("Nhập số thứ 2: ");
		secondNumber = scanner.nextInt();
		//tạo ra biến minNumber và gán giá trị ban đầu cho nó firstNumber
		int minNumber = firstNumber;
		
		//nếu firstNumber < secondNumber thì in ra firstNumber và ngược lại tại else
		if(firstNumber < secondNumber) {
			System.out.println("số nhỏ nhất là: " + minNumber);
		} else {
			minNumber = secondNumber;
			System.out.println("Số nhỏ nhất là: " + minNumber);
		}
	}

}

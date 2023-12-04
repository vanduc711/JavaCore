package collections;

import java.util.Scanner;

public class array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo biến lưu độ dài mảng
		int size;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập độ dài mảng: ");
		size = scanner.nextInt();
		
		//tạo mảng với độ dài size
		int array[] = new int[size];
		
		//dùng for để duyệt qua lần lượt độ dài mảng
		for(int i = 0; i < size; i++ ) {
			System.out.println("Nhập phần tử thứ "+ i +":");
			array[i] = scanner.nextInt();
		}
		//dùng for để duyệt ra các phần tử của mảng
		for(int i = 0; i < size; i++) {
			System.out.println("Phần tử thứ " + i + ": " + array[i]);
		}
		
	}

}

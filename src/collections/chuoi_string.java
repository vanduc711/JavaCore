package collections;

import java.util.Scanner;

public class chuoi_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo các biến
		String chuoi;
		char kytu;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		//sử dụng do while kiểm tra độ dài chuỗi
		do {
			System.out.println("Nhập một chuỗi bất kỳ: ");
			chuoi = scanner.nextLine();
		} while (chuoi.length() > 20);
		
		System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
		kytu = scanner.next().charAt(0);
		//Dùng for để đếm số lần ký tự xuất hiện trong chuỗi
		for(int i = 0; i < chuoi.length(); i++) {
			if(kytu == chuoi.charAt(i)) {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện ký tự " + kytu + " " + count);
		
//		int lineNumber;
//		String name = "BAP";
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.println("Nhập số lần xuất hiện name: ");
//			lineNumber = scanner.nextInt();
//		} while (lineNumber < 1);
//		
//		for (int i = 0; i < lineNumber; i++) {
//			System.out.print(name);
//		}
		
		
	}

}

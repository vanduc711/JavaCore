package collections;

import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soDong, soCot;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số dòng: ");
		soDong = sc.nextInt();
		System.out.println("Nhập số cột: ");
		soCot = sc.nextInt();
		
		//khai báo mảng 2 chiều và cấp phát bộ nhớ
		int array[][] = new int[soDong][soCot];
		
		//lặp qua từng phần tử mảng để nhập giá trị
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.println("Nhập giá trị cho dòng " + i + " cột " + j);
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Mảng đã nhập: ");
		//Dùng lại 2 vòng lặp để hiển thị ra dữ liệu mảng đã nhập
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.println(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}

}

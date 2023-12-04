package collections;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, tempSort; //tạo phần tử của mảng
		Scanner scanner = new Scanner(System.in);
		//sử dụng do while kiểm tra độ dài mảng
		do {
			System.out.println("Nhập số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n < 0);
		
		//khai báo và cấp phát bộ nhớ cho mảng
		int array[] = new int[n];
		
		//nhập giá trị cho các phần tử mảng
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập giá trị cho phần tử thứ "+ i + ": ");
			array[i] = scanner.nextInt();
		}
		//hiển thị mảng ban đầu
		System.out.println("\nHiển thị mảng ban đầu: ");
		for(int i = 0; i < n; i++) {
			System.out.println(array[i] + "\t");
		}
		
		for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (array[j] > array[j + 1]) {
	                tempSort = array[j];
	                array[j] = array[j+1];
	                array[j+1] = tempSort;
	            }
	        }
	    }
	         
	    System.out.println("\nMảng sau khi sắp xếp: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	}

}

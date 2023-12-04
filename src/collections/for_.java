package collections;

import java.text.DecimalFormat;
import java.util.Scanner;

public class for_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo các biến dạng số nguyên
		int number,n ,total = 0, avgNumber;
		Scanner scanner = new Scanner(System.in);
		//sử dụng decimalFomat để làm tròn đến 2 chữ số thập phân
		DecimalFormat decimalFormat = new DecimalFormat("#.##");  
		
		System.out.println("Nhập vào số lượng số nguyên: ");
		n = scanner.nextInt();
		//sử dụng vòng lặp for nếu i = n thì vòng lặp sẽ kết thúc và thực hiện phép tính
		for(int i = 1; i <= n; i++) {
			System.out.println("Nhập số thứ " + i + ": ");
			number = scanner.nextInt();
			total += number;
		}
		avgNumber = total / n;
		System.out.println("Trung bình cộng bằng:" + decimalFormat.format(avgNumber));
	}

}

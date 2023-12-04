package throw_example;

import java.util.Scanner;

public class ThrowExample {
	//khởi tạo phương thức check để kiểm tra điều kiện
	static void check(int age, int weight) {
		//nếu 1 trong 2 điều kiện không được đáp ứng sẽ báo lỗi
		if(age < 12 || weight < 40) {
			//bắt lỗi bị sai về số 
			throw new ArithmeticException("Học sinh này không đủ điều kiện");
		} else {
			System.out.println("Học sinh đã đủ điều kiện");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Chào mừng bạn đến trang đăng ký tham gia: ");
		System.out.println("Vui lòng nhập thông tin: ");
		System.out.println("Nhập số tuổi: ");
		int age = sc.nextInt();
		System.out.println("Nhập số cân nặng");
		int weight = sc.nextInt();
		check(age, weight);
		System.out.println("Chúc bạn có 1 ngày tốt lành");
	}

}

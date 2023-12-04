package throw_example;

import java.util.Scanner;
//tạo một lớp kế thừa từ Exception
class ThrowCustomerExeption extends Exception {
	//tạo exception với tham số là String
	public ThrowCustomerExeption(String s) {
		//sử dụng từ khóa super thay cho lớp cha và truyền vào tham số s (Exception)
		super(s);
	}
}	
	public class ThrowCustomer {
		//tạo phương thức check đầu vào 2 tham số chuỗi throws từ ThrowCustomerExeption
		void check(String a, String b) throws ThrowCustomerExeption {
			//kiểm tra xem chuỗi a có = b hay không
			if (a.equals(b)) {
				System.out.println("Thành công");
			} else {
				throw new ThrowCustomerExeption("Không hợp lệ");
			}
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			//tạo đối tượng ThrowCustomer
			ThrowCustomer throwCustomer = new ThrowCustomer();
			try {
				System.out.println("Nhập mật khẩu: ");
				String password_ = sc.nextLine();
				System.out.println("Nhập xác nhận mật khẩu: ");
				String confirm_password_ = sc.nextLine();
				System.out.println("Bắt đầu kiểm tra: ");
				//kiểm tra xem 2 tham số truyền vào
				throwCustomer.check(password_, confirm_password_);
			} catch (ThrowCustomerExeption exp) {
				System.out.println(exp);
			}
		}
	}
	


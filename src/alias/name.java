package alias;

import java.util.Scanner;

public class name {

	private String name;

	public void fullName() {
		System.out.println("Tên là: " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			//khởi tạo đối tượng name với tên y
			name y = new name();

			System.out.println("Nhập tên y: ");
			String name_y = sc.nextLine();
			y.setName(name_y);
			y.fullName();
			//khởi tạo đối tượng name với tên y
			name x = new name();
			System.out.println("Nhập tên x: ");
			String name_x = sc.nextLine();
			x.setName(name_x);
			x.fullName();
			//Gán x = y, bây h sẽ là x và y cùng quản lý một bộ nhớ
			//nên việc x thay đổi giá trị khiến y cũng bị thay đổi và ngược lại
			System.out.println("Gán x = y: ");
			x = y;
			x.setName("Trần Văn Đức");
			System.out.println("Kiểm tra giá trị y: ");
			y.fullName();

		}
	}

}

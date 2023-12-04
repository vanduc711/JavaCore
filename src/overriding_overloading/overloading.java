package overriding_overloading;


public class overloading {
	
	//tạo phương thức phepNhan với 2 tham số 
	public Integer phepNhan(int a, int b) {
		return a * b;
	}
	//tạo thêm phương thức trùng tên nhưng với 3 tham số
	public Integer phepNhan(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading overloading = new overloading();
		System.out.println("Nhân 2 số: " + overloading.phepNhan(2, 4));
		System.out.println("Nhân 3 số: " + overloading.phepNhan(2, 4, 6));
	}

}

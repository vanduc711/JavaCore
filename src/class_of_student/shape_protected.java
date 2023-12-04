package class_of_student;

public class shape_protected {
	
	//khai báo phương thức protected
	private int sides;
			
	//tạo hàm mặc định và khởi tạo giá trị side
	public shape_protected() {
		sides = 3;
	}
	
	//tạo phương thức protected
	protected void hienThi() {
		System.out.println("Có sides: " + sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape_protected shape = new shape_protected();
		
		shape.hienThi();
	}

}

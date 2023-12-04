package interface_;

//lớp main này mở rộng từ interface Student
public class main implements Student {

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("Phương thức của Person");
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("Phương thức của Person");
	}

	@Override
	public void nhapDiem() {
		// TODO Auto-generated method stub
		System.out.println("Phương thức của Student");
	}
	
	public static void main(String[] args) {
        main demo = new main();
        demo.nhap();
        demo.hienThi();
        demo.nhapDiem();
    }

}

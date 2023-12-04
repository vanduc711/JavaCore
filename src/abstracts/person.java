package abstracts;

public abstract class person {
	
	private String chucVu;

	public abstract void hienThiChucVu();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		giaoVien giaoVien = new giaoVien();
		
		giaoVien.hienThiChucVu();
		
		sinhVien sinhVien = new sinhVien();
		
		sinhVien.hienThiChucVu();
	}

}

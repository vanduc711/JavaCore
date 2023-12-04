package class_of_student;

import java.util.ArrayList;
import java.util.Scanner;

public class hotel_ {

	private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private  Nguoi nguoi;
    
    public hotel_() {
		super();
	}
    
    public hotel_(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
		super();
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.nguoi = nguoi;
	}

    public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
	
	public void nhapThongTinQuanLy() {
		Scanner sc = new Scanner(System.in);
		nguoi = new Nguoi();
		nguoi.nhapThongTinNguoi();
		
		System.out.println("Nhập số ngày trọ: ");
		soNgayTro = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập loại phòng: ");
		loaiPhong = sc.nextLine();
		System.out.println("Nhập giá phòng: ");
		giaPhong = sc.nextDouble();
		
	}
	
	public void hienThiThongTin() {
		nguoi.hienThiThongTinKhach();
		System.out.println("Số ngày trọ: " + soNgayTro);
		System.out.println("Loại phòng: " + loaiPhong);
		System.out.println("Giá phòng: " + giaPhong);
	}
	
	public double tinhTien() {
		return giaPhong * soNgayTro;
	}
	

public class Nguoi {
	   	private String hoTen;
	    private String soCMND;
	    private String queQuan;
		public Nguoi() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Nguoi(String hoTen, String soCMND, String queQuan) {
			super();
			this.hoTen = hoTen;
			this.soCMND = soCMND;
			this.queQuan = queQuan;
		}
		public String getSoCMND() {
			return soCMND;
		}
		public void setSoCMND(String soCMND) {
			this.soCMND = soCMND;
		}
		
	    
		//nhap thong tin khach san
		public void nhapThongTinNguoi() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên khách hàng: ");
			hoTen = sc.nextLine();
			System.out.println("Nhập số CMND: ");
			soCMND = sc.nextLine();
			System.out.println("Nhập quê quán: ");
			queQuan = sc.nextLine();
		}
		
		//hien thi thong tin khach hang
		public void hienThiThongTinKhach() {
			System.out.println("Thông tin khách hàng: ");
			System.out.println("Họ và tên: " + hoTen);
			System.out.println("Quê quán: " + queQuan);
			System.out.println("Số CMND: " + soCMND);
		}
	    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n; // so khach tro
		hotel_ hotel;
		
		//tạo ra 1 arrayList lưu thông tin khách trọ
		
		ArrayList<hotel_> arrHotel = new ArrayList<hotel_>();
		
		System.out.println("Nhập số lượng khách trọ: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			hotel = new hotel_();
			System.out.println("Nhập thông tin khách hàng thứ " + (i+1)+ " :");
			hotel.nhapThongTinQuanLy();
			arrHotel.add(hotel);
		}
		
		//hien thi danh sach tro
		for(int i = 0; i < arrHotel.size(); i++) {
			System.out.println("Thông tin khách hàng thứ " + (i+1) + " :");
			arrHotel.get(i).hienThiThongTin();
		}
		
		//tính tiền phòng
		System.out.println("Nhập số cmnd của khách hàng: ");
		sc.nextLine();
		String tim = sc.nextLine();
		for(int i = 0; i < arrHotel.size(); i++) {
			if(arrHotel.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
				System.out.println("Số tiền phòng: " + arrHotel.get(i).tinhTien());
			}
		}
		
	}

}

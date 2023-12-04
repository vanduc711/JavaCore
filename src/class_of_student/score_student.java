package class_of_student;

import java.util.Scanner;

public class score_student {
	
	private String name;
	private double diemToan, diemHoa, diemLy;
	
	public void nhapData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên học sinh");
		name = sc.nextLine();
		System.out.println("Nhập điểm toán: ");
		diemToan = sc.nextDouble();
		System.out.println("Nhập điểm hóa: ");
		diemHoa = sc.nextDouble();
		System.out.println("Nhập điểm lý: ");
		diemLy = sc.nextDouble();
	}
	
	public void showInfomation() {
		System.out.println("Tên: \n");
		System.out.println("Điểm toán:" + diemToan + "\tĐiểm hóa:" + diemHoa + "\tĐiểm lý: " + diemLy);
	}
	public double diemTrungBinh(double a, double b, double c) {
		return (a + b + c)/3;
	}	
	
	//xếp loại học lực
	public String xepLoai(double diemTrungBinh) {
		if(diemTrungBinh >= 8 && diemTrungBinh <= 10) {
			return "Giỏi";
		}
		if (diemTrungBinh >= 6.5 && diemTrungBinh < 8) {
			return "Khá";
		}
		if (diemTrungBinh >= 5 && diemTrungBinh < 6.5) {
			return "Trung bình";
		}
		return "Nhập sai!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		score_student student = new score_student();
		student.nhapData();
		student.showInfomation();
		System.out.println("Điểm trung bình: " + student.diemTrungBinh(student.diemToan, student.diemHoa, student.diemLy));
		System.out.println("Xếp loại học lực: " + student.xepLoai(student.diemTrungBinh(student.diemToan, student.diemHoa, student.diemLy)));
	
	}

}

package class_of_student;

import java.util.Scanner;

public class person {
	
	private int cmnd;
	private String name;
	
	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		person person_ = new person(); 
		//nhập dữ liệu
		System.out.println("Nhập số chứng minh nhân dân: ");
		int cmnd = sc.nextInt();
		person_.setCmnd(cmnd);
		
		System.out.println("Nhập họ và tên: ");
		sc.nextLine();
		String hoTen = sc.nextLine();
		person_.setName(hoTen);
		
		//Hiển thị dữ liệu
		System.out.println("Số CMND: " + person_.getCmnd() + " Họ và tên: " + person_.getName());
	}

}

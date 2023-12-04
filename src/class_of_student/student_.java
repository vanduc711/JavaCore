package class_of_student;

import java.util.Scanner;

public class student_ {
	private String nameStudent;
	private int age;
	
	private void createStudent() {
		System.out.println("Nhập tên học sinh: ");
		Scanner sc = new Scanner(System.in);
		nameStudent = sc.nextLine();
		System.out.println("Nhập số tuổi: ");
		age = sc.nextInt();
	}
	
	public void showInfomation() {
		System.out.println("Tên: " + nameStudent + " Tuổi: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student_ student = new student_();
		student.createStudent();
		student.showInfomation();
		
		shape_protected shape = new shape_protected();
		shape.hienThi();
		
	}

}

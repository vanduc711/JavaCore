package inheritance;

import java.util.Scanner;

import class_of_student.inheritance_;

public class MyCaculator extends Caculator{
	
	public void phepNhan(int a, int b) {
		c = a * b;
		System.out.println("Tích hai số " + a + " và " + b + " là: " + c);
	}
	public void phepChia(int a, int b) {
		c = a / b;
		System.out.println("Thương hai số " + a + " và " + b + " là: " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		MyCaculator myCaculator = new MyCaculator();
		
		System.err.println("Nhập số a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Nhập số b: ");
		b = sc.nextInt();
		
		System.out.println("Tổng 2 số: ");
		myCaculator.phepCong(a, b);
		System.out.println("Hiệu 2 số: ");
		myCaculator.phepTru(a, b);
		System.out.println("Tích 2 số: ");
		myCaculator.phepNhan(a, b);
		System.out.println("Thương 2 số: ");
		myCaculator.phepChia(a, b);
	}

}

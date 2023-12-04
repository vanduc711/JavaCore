package class_of_student;

import java.util.Scanner;

public class inheritance_ {
	
	public int c;
	
	public void phepCong(int a, int b) {
		c = a + b;
		System.out.println("Tổng hai số " + a + " và " + b + " là: " + c);
	}
	public void phepTru(int a, int b) {
		c = a - b;
		System.out.println("Hiệu hai số " + a + " và " + b + " là: " + c);
	}

public class myInheritance extends inheritance_ {
	
	public void phepNhan(int a, int b) {
		c = a * b;
		System.out.println("Tích hai số " + a + " và " + b + " là: " + c);
	}
	public void phepChia(int a, int b) {
		c = a / b;
		System.out.println("Thương hai số " + a + " và " + b + " là: " + c);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		
		inheritance_ myInheritance_ = new inheritance_();
		
		
		System.err.println("Nhập số a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Nhập số b: ");
		b = sc.nextInt();
		
		System.out.println("Tổng 2 số: ");
		

	}

}

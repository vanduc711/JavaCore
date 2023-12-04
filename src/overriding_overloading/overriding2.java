package overriding_overloading;

import java.util.Scanner;
//kế thừa từ lớp cha là overriding
public class overriding2 extends overriding{
	
	private int age;
	//ghi đè lại phương thức full name kế thừa từ lớp cha
	public void fullName() {
		System.out.println("Tên: " + name + " tuổi: " + age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//khai báo đối tượng
		overriding2 overriding2 = new overriding2();
		System.out.println("Nhập thông tin: ");
		System.out.println("Nhập họ và tên: ");
		overriding2.name = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		overriding2.age = sc.nextInt();
		
		overriding2.fullName();
		
	}

}

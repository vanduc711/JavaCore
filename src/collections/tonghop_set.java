package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class tonghop_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tenKhoa;
		Set<String> khoa = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		khoa.add("Khoa CNTT");
		khoa.add("Khoa KT");
		khoa.add("Khoa Y Tế");
		
		
		//Sử dụng iterator để duyệt qua các phần tử
		Iterator<String> iterator = khoa.iterator();
		
		System.out.println("Các khoa của trường đại học là: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Nhập tên khoa muốn thêm
		System.out.println("Nhập tên khoa muốn thêm: ");
		tenKhoa = sc.nextLine();
		//thêm một khoa mới
		if(!khoa.contains(tenKhoa)) {
			khoa.add(tenKhoa);
			System.out.println("Bạn đã thêm thành công");
			System.out.println("Đây là danh sách khóa học mới: " + khoa);
		} else {
			System.out.println("Khoa bạn muốn thêm đã tồn tại");
		}
		
		System.out.println("Nhập tên khoa muốn xóa: ");
		tenKhoa = sc.nextLine();
		//xóa một khoa 
		if(khoa.contains(tenKhoa)) {
			khoa.remove(tenKhoa);
			System.out.println("Bạn đã thêm thành công");
			System.out.println("Đây là danh sách khóa học mới: " + khoa);
		} else {
			System.out.println("Khoa bạn muốn xóa không tồn tại");
		}
	}

}

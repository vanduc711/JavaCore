package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class hash_set_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits;
		int n;
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> hashSetFruits = new HashSet<String>();
		//Nhập số lượng trái cây muốn thêm
		System.out.println("Nhập số lượng trái cây muốn thêm: ");
		n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập tên trái cây thứ " + i);
			fruits = sc.nextLine();
			hashSetFruits.add(fruits);
		}
		System.out.println(hashSetFruits);
		//tạo chức năng tìm kiếm
		System.out.println("Nhập tên trái cây muốn tìm: ");
		fruits = sc.nextLine();
		if (hashSetFruits.contains(fruits)) {
			System.out.println("Có trái cây " + fruits);
		} else {
			System.out.println("Không có trái cây " + fruits);
		}
		//xóa 1 trái cây bất kỳ
		System.out.println(hashSetFruits);
		System.out.println("Nhập tên trái cây bạn muốn xóa");
		fruits = sc.nextLine();
		hashSetFruits.remove(fruits);
		System.out.println("Các loại trái cây còn lại: "+hashSetFruits);
		
		List<String> listNewFruits = new LinkedList<String>();
		//Nhập số lượng trái cây muốn thêm
		System.out.println("Nhập số lượng trái cây muốn thêm: ");
		n = Integer.parseInt(sc.nextLine());
				
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập tên trái cây thứ " + i);
			fruits = sc.nextLine();
			listNewFruits.add(fruits);
		}
		
		hashSetFruits.addAll(listNewFruits);
		//sử dụng iterator để duyệt qua các phần tử
		Iterator<String> iterator = hashSetFruits.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		System.out.println("Danh sách trái cây mới: "+hashSetFruits);
		hashSetFruits.removeAll(listNewFruits);
		System.out.println("Danh sách trái cây mới: "+hashSetFruits);
	}

}

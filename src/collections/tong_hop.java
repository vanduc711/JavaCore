package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class tong_hop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listString = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		//thêm phần tử vào mảng
		for(int i = 1; i < 13; i++) {
			listString.add("Tháng " + i);
		}
//		System.out.println(listString);
		
		ListIterator<String> listIterator = listString.listIterator();
		System.out.println("Hiển thị phần tử sử dụng listIterator: ");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		//hiển thị các phần tử từ dưới lên
		System.out.println("Hiển thị các phần tử từ dưới lên: ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		//thay đổi bất kì phần tử trong listString
		System.out.println("Nhập phần tử mới: ");
		String newElement = sc.nextLine();
		System.out.println("Nhập vào vị trí cần thay đổi ");
		int index = sc.nextInt();
		listString.set(index, newElement);
		
		System.out.println("Hiện thị các phần tử sau khi thay đổi");
		for(String str: listString) {
			System.out.println(str);
		}
		
		listString.remove(index);
		System.out.println("Hiện thị các phần tử sau khi xóa");
		for(String str: listString) {
			System.out.println(str);
		}
		
	}

}

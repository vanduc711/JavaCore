package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class interface_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Green");
		arrayList.add("Black");
		arrayList.add("Yellow");
		arrayList.add("Pink");
		//dùng iterator duyệt qua các phần tử của arrayList
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Truy vấn phần tử trong arrayList
		System.out.println("Nhập chỉ số của bạn muốn truy vấn: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		if ((index < 0 || index > arrayList.size() - 1)) {
			System.out.println("Chỉ số bạn nhập lớn hơn so với " + arrayList.size());
		} else {
			System.out.println(arrayList.get(index));
		}
		
		//thêm một phần tử vào trong arrayList
		System.out.println("Chọn chức năng thêm phần tử: ");
		System.out.println("1. Chọn vị trí để thêm: ");
		System.out.println("2. Thêm vào cuối");
		int number = sc.nextInt();
		switch (number) {
			case 1: 
				System.out.println("Nhập vị trí mà bạn muốn thêm: ");
				int index2 = sc.nextInt();
				if ( index2 < 0 || index2 > arrayList.size() - 1) {
					System.out.println("Chỉ số bạn nhập không tồn tại");
				} else {
					sc.nextLine();
					System.out.println("Nhập giá trị của bạn muốn thêm: ");
					String value = sc.nextLine();
					arrayList.add(index2, value);
				}				
				break;
			case 2: 
				sc.nextLine();
				System.out.println("Nhập giá trị mà bạn muốn thêm: ");
				String value2 = sc.nextLine();
				arrayList.add(value2);
				break;
			default: 
				System.out.println("Bạn nhập không đúng");
		}
		System.out.println(arrayList);
	}

}

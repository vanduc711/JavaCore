package collections;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedListExits = new LinkedList<String>();

		linkedListExits.add("Monday");
		linkedListExits.add("Tuesday");
		linkedListExits.add("Wednesday");
		linkedListExits.add("Thurday");

		for (String str : linkedListExits) {
			System.out.println(str);
		}

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Tuesday");
		linkedList.add("Wednesday");
		linkedList.add("Thurday");

		linkedListExits.addAll(linkedList);
		System.out.println(linkedListExits);
		// chỉ lấy những phần tử khác nhau
		Set<String> setList = new TreeSet<String>(linkedListExits);
		System.out.println(setList);
		// thêm 1 phần tử
		Scanner sc = new Scanner(System.in);
		int day;

		System.out.println("Thêm ngày mới: ");
		day = sc.nextInt();

		switch (day) {
		case 1:
			linkedListExits.add("Monday");
			break;
		case 2:
			linkedListExits.add("Tuesday");
			break;
		case 3:
			linkedListExits.add("Wednesday");
			break;
		case 4:
			linkedListExits.add("Thurday");
			break;
		default:
			System.out.println("Bạn chỉ được thêm từ thứ 2 đến thứ 5 mà thôi");
		}
		System.out.println("Đây là danh sách ngày: \n" + linkedListExits);
		// chống trôi lệnh
		sc.nextLine();
		System.out.println("Xóa một ngày mà bạn muốn: ");
		String dayRemove = sc.nextLine();

		// xóa một phần tử
		if (!linkedListExits.contains(dayRemove)) {
			System.out.println("Ngày bạn muốn xóa hiện không tồn tại");
		} else {
			linkedListExits.remove(dayRemove);
			System.out.println("Bạn đã xóa thành công");
			System.out.println(linkedListExits);
		}
		
		//cập nhật 1 phần tử
		System.out.println("Nhập index của ngày cần thay đổi: ");
		int index = Integer.parseInt(sc.nextLine());
		
		if ((index < 0) || (index > (linkedListExits.size() - 1))) {
	        System.out.println("Chỉ số cần thay đổi phải lớn hơn 0 và nhỏ hơn "
	            + (linkedListExits.size()-1));
	    } else {
	    	System.out.println("Nhập ngày mới: ");
			String value = sc.nextLine();
	        linkedListExits.set(index, String.valueOf(value));
	    }
		System.out.println(linkedListExits);
	}

}

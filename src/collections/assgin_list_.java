package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class assgin_list_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors[] = {"black", "white", "yellow"};
		String colors2[] = {"purple", "green", "pink"};
		
		//khai báo 2 list có class là LinkedList
		List<String> list = new LinkedList<String>();
		List<String > list2 = new LinkedList<String>();
		
		//thêm các phần tử vào trong 2 mảng
		for(int i = 0; i < colors.length; i++) {
			list.add(colors[i]);
			list2.add(colors2[i]);
		}
		
		//thêm phần từ list2 vào list và list2 = null
		list.addAll(list2);
		list2 = null;
		
		//hiển thị các phần tử có trong mảng
		System.out.println("Hiển thị các phần tử có trong mảng");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ "\t");
		}
		
		//chuyển các phần tử thành chữ hoa
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String str = listIterator.next();
			listIterator.set(str.toUpperCase());
		}
		System.out.println("Hiển thị các phần tử có trong mảng sau khi thay đổi");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ "\t");
		}
		
		//xóa phần tử trong phạm vi 2-4 trong mảng
		list.subList(2, 4).clear();
		System.out.println("Hiển thị các phần tử sau khi đã xóa trong mảng");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+ "\t");
		}
		listIterator = list.listIterator(list.size());
		System.out.println("Hiển thị các phần tử sau khi đảo ngược: ");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous() + "\t");
		}
		
	}

}

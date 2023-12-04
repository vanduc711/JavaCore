package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set_retain_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array1[] = {1, 20, 8, 5};
		Integer array2[] = {8, 9, 20};
		
		//chuyển các mảng thành một dạng danh sách có kiểu dữ liệu giống nhau
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		//Chuyển list thành set
		Set<Integer> setList1 = new HashSet<Integer>(list1);
		Set<Integer> setList2 = new HashSet<Integer>(list2);
		
		//lấy phần giao của list1 và list2
		setList2.retainAll(setList1);
		
		System.out.println("Phần tử giao nhau giữa setList2 và setList1 là: " + setList2);
	}

}

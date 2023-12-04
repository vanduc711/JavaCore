package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set_contants_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arraySet1[] = {1, 2, 4, 5};
		Integer arraySet2[] = {2, 3};
		
		//Chuyển mảng set1 và set2 sang một danh sách có cùng 1 kiểu dữ liệu
		List<Integer> list1 = Arrays.asList(arraySet1);
		List<Integer> list2 = Arrays.asList(arraySet2);
		
		//chuyển list thành set
		Set<Integer> setInteger1 = new HashSet<Integer>(list1);
		Set<Integer> setInteger2 = new HashSet<Integer>(list2);
		
		if(setInteger1.containsAll(setInteger2)) {
			System.out.println("setInteger2 là tập hợp con của setInteger1");
		} else {
			System.out.println("setInteger2 là không phải tập hợp con của setInteger1");
		}
	}

}

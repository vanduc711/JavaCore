package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo interface set với kiểu dữ liệu Int sử dụng class Iterface Hashset
		Set<Integer> hashSetInt = new HashSet<Integer>();

		hashSetInt.add(1);
		hashSetInt.add(11);
		hashSetInt.add(8);
		hashSetInt.add(90);
		
		//Khai báo interface set với kiểu dữ liệu Int sử dụng class Iterface TreeSet
		Set<Integer> treeSetInt = new TreeSet<Integer>();
		
		treeSetInt.add(1);
		treeSetInt.add(11);
		treeSetInt.add(8);
		treeSetInt.add(90);
		
		//HashSet sẽ không sắp xếp thứ tự của mảng
		System.out.println("HashSet: ");
		System.out.println(hashSetInt);
		//TreeSet sẽ tự động sắp xếp thứ tự của mảng theo chiều tăng dần
		System.out.println("TreeSet: ");
		System.out.println(treeSetInt);
		
	}

}

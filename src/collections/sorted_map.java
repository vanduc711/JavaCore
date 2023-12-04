package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sorted_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo SortedMap với key là Int và value là String
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
		//để thêm các cặp key,value vào sortedMap dùng put
		sortedMap.put(1, "One");
		sortedMap.put(2, "Two");
		sortedMap.put(3, "Three");
		sortedMap.put(4, "Four");
		
		System.out.println(sortedMap);
		//subMap lấy key và value từ key 1 - trước key 3
		System.out.println("\nHiển thị subMap: ");
		Map<Integer, String> subMap = sortedMap.subMap(1, 3);
		subMap.forEach((keyInt, valueStr) -> 
		System.out.println("Key: " + keyInt + " Value: " + valueStr));
		//headMap là lấy từ key đầu tiên đến trước key 4
		System.out.println("\nHiển thị headMap: ");
		Map<Integer, String> headMap = sortedMap.headMap(4);
		headMap.forEach((keyInt, valueStr) -> 
		System.out.println("Key: " + keyInt + " Value: " + valueStr));
		//lấy từ key 2 đến cuối 
		System.out.println("\nHiển thị tailMap: ");
		Map<Integer, String> tailMap = sortedMap.tailMap(2);
		tailMap.forEach((keyInt, valueStr) -> 
		System.out.println(keyInt + " " + valueStr));
		//sử dụng 2 phương thức này để lấy key lớn nhất và bé nhất
		int keyBiggest = sortedMap.lastKey();
		int keySmallest = sortedMap.firstKey();
		System.out.println("Key lớn nhất là: " + keyBiggest + " Key bé nhất là: " + keySmallest);
	}

}

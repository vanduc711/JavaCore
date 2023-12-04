package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map_hash_tree_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo map interface với tên là hashMap
		//sử dụng class là HashMap
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "One");
		hashMap.put(3, "Three");
		hashMap.put(11, "Eleven");
		hashMap.put(5, "Five");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "One");
		treeMap.put(3, "Three");
		treeMap.put(2, "Two");
		treeMap.put(5, "Five");
		
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(1, "One");
		linkedMap.put(3, "Three");
		linkedMap.put(2, "Two");
		
		System.out.println("Các phần tử trong hashMap: " + hashMap);
		System.out.println("Các phần tử trong treeMap: " + treeMap);
		System.out.println("Các phần tử trong linkedMap: " + linkedMap);
		//lấy toàn bộ key + value
		treeMap.forEach((key, value) -> System.out.println("key: " + key + " value " + value));
	
		//lấy toàn bộ key
		for(Integer key : treeMap.keySet()) {
			System.out.println("key: " + key);
		}
		
		//lấy toàn bộ value
		for(String value : treeMap.values()) {
			System.out.println("key: " + value);
		}
		
		//sử dụng iterator để lấy tất cả phần tử của mảng
		System.out.println("iterator: ");
		Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//sử dụng iterator lấy key của map
		System.out.println("Lấy key của map: ");
		Iterator<Integer> iteratorKey = treeMap.keySet().iterator();
		while (iteratorKey.hasNext()) {
			System.out.println(iteratorKey.next());
		}
		//sử dụng iterator lấy value của map
		System.out.println("Value của map");
		Iterator<String> iteratorValue = treeMap.values().iterator();
		while	(iteratorValue.hasNext()) {
			System.out.println(iteratorValue.next());
		}
	}

}

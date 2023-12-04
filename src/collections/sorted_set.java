package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class sorted_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sử dụng interface list tạo ra mảng sử dụng
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(3);
		listInteger.add(8);
		listInteger.add(11);
		listInteger.add(20);
		listInteger.add(12);
		
		SortedSet<Integer> sortedInteger = new TreeSet<Integer>(listInteger);
		System.out.println("Các phần tử của sortedString: " + sortedInteger);
		//subSet lấy từ điểm element đầu đến cuối điểm element
		SortedSet<Integer> subset = sortedInteger.subSet(2, 20);
	    System.out.println("Các phần tử có trong subset: ");
	    System.out.println(subset);
	    
	    //headSet lấy từ đầu đến điểm element
	    SortedSet<Integer> headset = sortedInteger.headSet(11);
	    System.out.println("Các phần tử có trong headSet: " + headset);
	    //từ element đến cuối
	    SortedSet<Integer> tailset = sortedInteger.tailSet(3);
	    System.out.println("Các phần tử có trong tailset: " + tailset);
	    
	    //tìm phần tử lớn nhất trong mảng và nhỏ nhất
	    int phantulonnhat = sortedInteger.last();
	    int phantubennat = sortedInteger.first();
	    System.out.println("Phần tử lớn nhất là: " + phantulonnhat + "\nPhần tử bé nhất: " + phantubennat);
	}
}

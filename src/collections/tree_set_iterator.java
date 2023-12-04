package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class tree_set_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> setDouble = new TreeSet<Double>();
		
		Iterator<Double> iterator = null;
		
		Double number;
		Scanner sc = new Scanner(System.in);
		
		setDouble.add(12.2d);
		setDouble.add(20.33d);
		setDouble.add(0.22d);
		
		System.out.println("Các phần tử trong setDouble là: ");
		
		iterator = setDouble.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//nhập phần tử muốn thêm
		System.out.println("Nhập phần tử muốn thêm");
		number = sc.nextDouble();
		
		//thêm một phần tử mới từ bản phím
		//nếu phần tử bị trùng thì hiện thông báo
		if(!setDouble.contains(number)) {
			setDouble.add(number);
			System.out.println("Thêm thành công");
			System.out.println("Các phần tử sau khi thêm: " + setDouble);
		} else {
			System.out.println("Phần tử bạn nhập đã tồn tại");
		}
		
	}

}

package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class add_data_to_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soSinhVien = 2;
		Map<String, String> mapStudents = new TreeMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String tenSV, maSV;
		
		//Thêm thông tin của 2 sinh viên vào trong mapStudents
		for (int count = 1; count <= soSinhVien; count++) {
			System.out.println("Nhập mã số sinh viên" + count);
			maSV = sc.nextLine();
			System.out.println("Nhập tên sinh viên: ");
			tenSV = sc.nextLine();
			mapStudents.put(maSV, tenSV);
		}
		
		System.out.println("Danh sách sinh viên: ");
		Iterator<Map.Entry<String, String>> iterator = mapStudents.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//thêm 1 sinh viên vào mapStudents
		System.out.println("Nhập mã sinh viên mới: ");
		String maSVM = sc.nextLine();
		System.out.println("Nhập tên sinh viên mới: ");
		String tenSVM = sc.nextLine();
		
		if(mapStudents.containsKey(maSVM)) {
			System.out.println("Mã sinh viên " + maSVM + " đã tồn tại");
		} else {
			mapStudents.put(maSVM, tenSVM);
			System.out.println("Thêm sinh viên mới thành công");
//			System.out.println("Danh sách sinh viên hiện tại: " + mapStudents);
			iterator = mapStudents.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = iterator.next();
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			}
		}
	}

}

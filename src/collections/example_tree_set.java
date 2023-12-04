package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class example_tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course;
		String courses[] = {"JAVA", "PHP", "DART"};
		Set<String> setLearn = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		
		//tạo vòng lặp để duyệt qua thêm các phần tử từ mảng course vào trong listlearn
		for(int count = 0; count < courses.length; count++) {
			setLearn.add(courses[count]);
		}
		//hiện ra danh sách đã thêm 
		System.out.println(setLearn);
		
		//nhập phần tử bạn muốn xóa
		System.out.println("Nhập phần tử bạn muốn xóa: ");
		course = sc.nextLine();
		
		//kiểm tra nếu phát hiện có phần tử trong mảng thì xóa
		if(setLearn.contains(course)) {
			setLearn.remove(course);
			System.out.println("Bạn đã xóa thành công");
			System.out.println("Danh sách được cập nhật sau khi bạn xóa: " + setLearn);
		} else {
			System.out.println("Phần tử bạn muốn xóa hiện không tồn tại");
		}
		
	}	

}

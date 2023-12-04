package collections;

import java.util.LinkedList;
import java.util.List;

public class list_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai báo list interface có tên là listString và có kiểu dũng liệu là string
		List<String> listString = new LinkedList<String>();
		
		listString.add("Một");
		listString.add("Hai");
		listString.add("Ba");
		
		//dùng vòng lặp for duyệt qua các phần tử
		System.out.println("Các phần tử trong listString là: ");
		for(String element : listString) {
			System.out.println(element);
		}
		
	}

}

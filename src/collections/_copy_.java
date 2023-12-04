package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _copy_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//danh sách đầu vào
		List<String> listSource = new ArrayList<String>();
		
		listSource.add("duc");
		listSource.add("tv");
		//danh sách đích
		List<String> listDest = new ArrayList<String>();
		listDest.add("A");
		listDest.add("B");
		listDest.add("@bap.");
		listDest.add("jp");
		
		//copy phần tử của listSource dán vào trong listDest
		Collections.copy(listDest, listSource);
		
		//vì listSource chỉ có 2 phần tử 
		//nên chỉ thay đổi 2 phần tử đầu tiên của listDest 
		//và giữ nguyên các phần tử phía sau
		System.out.println("Các phần tử có trong listDest: ");
		for(String str : listDest) {
			System.out.println(str);
		}
	}

}

package collections;

import java.util.ArrayList;
import java.util.List;

public class array_interface_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<Integer>();
		
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		
		//add phan moi vao vi tri bat ky trong mang
		listInt.add(1, 3);
		
		System.out.println("Cac phan tu cua mang listInt: ");
		for(Integer value: listInt) {
			System.out.println(value);
		}
	}

}

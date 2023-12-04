package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Character> mapString = new TreeMap<Integer, Character>();
		Scanner sc = new Scanner(System.in);
		String str;
		
		
		//Nhập chuỗi ký tự
		System.out.println("Nhập chuỗi: ");
		str = sc.nextLine();
		
		//Chuyển đổi chuỗi ký tự thành mảng char
		char charStr[] = str.toCharArray();
		//tạo set char để thêm các char vào đó
		Set<Character> setChar;
		setChar = new TreeSet<Character>();
		
		//thêm các ký tự vào setChar
		for (char ch : charStr) {
			setChar.add(ch);
		}
		//hiển thị các ký tự kèm size
		
		for (Character ch : setChar) {
	        mapString.put(str.length(), ch);
	        System.out.print(mapString.keySet() + "=>" + mapString.values() + "\n");
	    }
	}

}

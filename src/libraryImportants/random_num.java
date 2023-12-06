package libraryImportants;

import java.util.Random;
import java.util.StringTokenizer;

public class random_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			stringBuilder.append("Xin chào lần " + i);
			stringBuilder.append("\t");
		}
		System.out.println(stringBuilder);
		
		//chèn 1 ký tự/số/chuỗi vào trong 1 vị trí bất kỳ
		StringBuilder stringBuilder2 = new StringBuilder("XinChao");
		String bool = "No";
		stringBuilder2.insert(2, bool);
		System.out.println(stringBuilder2);
		//xóa 1 ký tự
		stringBuilder2.deleteCharAt(3);
		System.out.println("Xóa 1 ký tự: " + stringBuilder2);
		
		//xóa nhiều ký tự
		stringBuilder2.delete(2, 5);
		System.out.println("Xóa nhiều ký tự: " + stringBuilder2);
		
		//đảo ngược các ký tự
		stringBuilder2.reverse();
		System.out.println(stringBuilder2);
		//loại bỏ khoảng trắng
		String str = "Học, học nữa, học mãi";
		
		StringTokenizer stringTokennizer = new StringTokenizer(str);
		System.out.println("Phân cách theo khoảng trắng: ");
		while (stringTokennizer.hasMoreTokens()) {
			System.out.println(stringTokennizer.nextToken());
		}
		
		//loại bỏ theo khoảng trắng và ,
		StringTokenizer stringTokenizer2 = new StringTokenizer(str, ", ");
		System.out.println("Phân cách theo khoảng trắng và dấu phẩy: ");
		while (stringTokenizer2.hasMoreTokens()) {
			System.out.println(stringTokenizer2.nextToken());
		}
	}

}

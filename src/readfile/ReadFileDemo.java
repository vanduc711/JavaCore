package readfile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo file mới 
		File file = new File("C:\\Users\\VanDuc\\Test\\newFile.txt");
		//thiết lập giá trị ban đầu 
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			//tạo đối tượng fis với tham số file
			fis = new FileInputStream(file);
			//tạo đối tượng bis với tham số là fis để tăng tốc độ đọc file
			bis = new BufferedInputStream(fis);
			//sử dụng vòng lặp để đọc
			//phương thức available = 0 khi con trỏ nằm ở cuối file
			while(bis.available() > 0) {
				//đọc file bằng phương thức read
				System.out.print((char)bis.read());
			}
		//sử dụng các exception để bắt lỗi
		} catch (FileNotFoundException fnfe) {
			System.out.println("Không tìm thấy file " + fnfe);
		} catch (IOException ioe) {
			System.out.println("Lỗi I/0: " + ioe);
		} finally {
			//kiểm tra xem giá trị cuối cùng 
			//nếu có thì đóng luồng của các đối tượng
			try {
				if(bis != null && fis != null) {
					fis.close();
					bis.close();
					System.out.println("\tĐã kết thúc");
				}
			} catch (IOException ioe) {
				System.out.println("Lỗi InputStream close(): " + ioe);
			}
		}
	}

}

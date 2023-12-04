package writefile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thiết lập giá trị cho fileOuput ban đầu = null
		FileOutputStream fos = null;
		//Tạo đối tượng file
		File file;
		String content = "Xin chao moi nguoi";
		try {
			//thiết lập đường dẫn
			file = new File("C:\\Users\\VanDuc\\Test\\newFile.txt");
			//truyền file là tham số cho fileOuput
			fos = new FileOutputStream(file);
			//kiểm tra nếu file không tồn tại thì tạo file mới và ghi 
			if (!file.exists()) {
				file.createNewFile();
			}
			//chuyển đoạn chuỗi thành mảng byte
			byte[] bytesArray = content.getBytes();
			//thực hiện ghi mảng byte 
			fos.write(bytesArray);
			//flush là đảm bảo dữ liệu đã được ghi thành công
			fos.flush();
			System.out.println("Đã ghi thành công");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Lỗi khi đóng luồng");
			}
		}
	}

}

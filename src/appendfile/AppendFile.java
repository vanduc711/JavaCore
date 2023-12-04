package appendfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//tạo đối tượng file
			File file = new File("C:\\Users\\VanDuc\\Test\\newFile.txt");
			//kiểm tra file đã tồn tại chưa
			if (!file.exists()) {
				file.createNewFile();
			}
			//tạo đối tượng FileWriter để nối nội dung
			//nhận 2 tham số là file và true là ghi tiếp , nếu để trống hoặc false thì sẽ ghi đè dữ liệu cũ
			FileWriter fw = new FileWriter(file, true);
			//sử dụng BufferedWriter để tăng tốc độ ghi file
			BufferedWriter bw = new BufferedWriter(fw);
			//sử dụng printWriter để ghi file
			PrintWriter pw = new PrintWriter(bw);
			//thực hiện ghi các dữ liệu sau
			pw.println("");
			pw.println("Dong 1");
			pw.println("Dong 2");
			pw.close();
			
			System.out.println("Dữ liệu mới đã được thêm vào file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

}

package deletefile;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\VanDuc\\Test\\newFile.txt");
		try {
			if (file.delete()) {
				System.out.println(file.getName() + " đã được xóa");
			} else {
				System.out.println("Xóa file không thành công: file chưa xóa");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}

}

package createfile;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\VanDuc\\Test\\newFile.txt");
			
			boolean check = file.createNewFile();
			if(check) {
				System.out.println("Tạo file thành công");
			} else {
				System.out.println("Phát hiện có file trùng tên đang có");
			}
		} catch (IOException e) {
			System.out.println("Exception xảy ra: ");
			e.printStackTrace();
		}
		
	}

}

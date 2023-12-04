package libraryImportants;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo đối tượng calendar mô tả thời gian hiện tại
		Calendar cal = Calendar.getInstance();
		
		//tạo đối tượng Date
//		//sử dụng method getTime() đế hiển thị thời gian hiện tại
		Date date = cal.getTime();
		System.out.println("Thời gian bây giờ là: " + date);
		
		//Ngày hiện tại
		System.out.println("Ngày hôm nay là: " + cal.get(Calendar.DAY_OF_MONTH));
		//Tháng hiện tại
		System.out.println("Tháng này là: " + (cal.get(Calendar.MONTH)+1));
		//Năm hiện tại 
		System.out.println("Năm hiện tại là: " + cal.get(Calendar.YEAR));
		//Phút hiện tại
		System.out.println("Phút hiện tại là: " + cal.get(Calendar.MINUTE));
		//Giây hiện tại
		System.out.println("Giây hiện tại là: " + cal.get(Calendar.SECOND));
		
		//SimpleDateFormat dùng để định dạng kiểu 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Thời gian sau khi định dạng lại là: " + sdf.format(date));
		//địng dạng ngày giờ
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		System.out.println("Ngày giờ sau khi định dạng lại là: " + sdf2.format(date));
	}

}

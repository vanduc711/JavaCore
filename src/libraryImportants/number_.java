package libraryImportants;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//định dạng số của khu vực máy ảo JVM
		NumberFormat currentLocale = NumberFormat.getInstance();
		
		//sử dụng double
		double doubleNumber = 10.08d;
		
		//tạo 1 numberFormat theo tiêu chuẩn nước Anh
		@SuppressWarnings("deprecation")
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		System.out.println("Anh " + en.format(doubleNumber));
		
		long vnd = 100000l;
		//tạo 1 numberFormat theo tiêu chuẩn nước Việt Nam
		@SuppressWarnings("deprecation")
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		String str1 = currencyVN.format(vnd);
		System.out.println("Việt Nam " + str1);
		System.out.println("Kiểu đơn vị tiền tệ của " 
		+ localeVN.getCountry() 
		+ " là: " 
		+ currencyVN.getCurrency());
		
		//định dạng 1 số ở dạng %
		double percent = 0.8939d;
		
		NumberFormat numEN = NumberFormat.getPercentInstance();
		String percentEN = numEN.format(percent);
		System.out.println("Chuyển thành dạng phần trăm: "+percentEN);
		
		double numd = 222.234d;
		//Khai báo 1 DecimalFormat để format số theo mẫu #.###
		DecimalFormat dcf = new DecimalFormat("#.###");
		
		System.out.println("Sau khi định dạng: " + dcf.format(numd));
		
		//Khai báo 1 pattern chứa mẫu ###,##.##%
		String pattern = "###,##.##%";
		//truyền pattern vào tham số của DecimalFormat
		DecimalFormat dcf2 = new DecimalFormat(pattern);
		dcf.applyPattern(pattern);
		System.out.println("Sau khi định dạng " + dcf2.format(numd));
	}

}

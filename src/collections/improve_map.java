package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class improve_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mapCity = new TreeMap<String, String>();
		mapCity.put("HN", "Hà Nội");
		mapCity.put("GL", "Gia Lai");
		
		mapCity.put("QT", "Quảng Trị");
		mapCity.put("DN", "Đà Nẵng");
		
		System.out.println("Danh sách các thành phố trong mapCity: ");
		Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
		System.out.println(setCity);
		//dùng phương thức get để lấy value với điều kiện biết được key
		System.out.println("HN: " + mapCity.get("HN"));
		
		//kiểm tra xem 1 value có trong map hay không
		if(mapCity.containsValue("Gia Lai")) {
			System.out.println("Value tồn tại");
		} else {
			System.out.println("Value không tồn tại");
		}
		
		//xóa entry có khóa là :
		mapCity.remove("HN");
		System.out.println(setCity);
		
		mapCity.replace("DN", "Đà Nẵng", "Thành phố Đà Nẵng");
		System.out.println(setCity);
		//sao chép entry từ 1 map này sang map khác
		Map<String, String> mapCopy = new TreeMap();
		
		System.out.println("Số lượng phần tử trước khi sao chép là: " + (mapCopy.size()));
		mapCopy.putAll(mapCity);
		System.out.println("Số lượng phần tử sau khi sao chép là: " + (mapCopy.size()));
		Set<Map.Entry<String, String>> setMapCopy = mapCopy.entrySet();
		System.out.println(setMapCopy);
	}

}

package interface_;

//tạo một lớp và lớp này mở rộng từ interface Interface_
public class Implement_interface implements Interface_ {
	
	//lớp này mở rộng từ Interface_ nên có phương thức createAbstractMethods
	@Override
	public void createAbstractMethods() {
		System.out.println("Đây là phương thức của Interface_");
	}
	
	public static void main(String[] args) {
		//khai báo đối tượng và sử dụng phương thức
        Implement_interface demo = new Implement_interface();
        demo.createAbstractMethods();
    }
}

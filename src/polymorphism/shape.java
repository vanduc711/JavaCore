package polymorphism;

public class shape {
	
	public void show() {
		System.out.println("Đây là show của shape");
	}

	 public static void main(String[] args) {
	        shape shape = new shape();
	        shape.show();   // hiển thị show của lớp shape
	         
	        // bản chất vẫn là shape nhưng vì tạo mới rectangle nên sẽ là rectangle
	        shape = new rectangle();
	        shape.show();   // hiển thị show của lớp rectangle
	         
	        // tương tự lúc này shape sẽ là square
	        shape = new square();
	        shape.show();   // hiển thị show của lớp square
	    }
	 
	}

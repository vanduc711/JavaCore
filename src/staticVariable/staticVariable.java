package staticVariable;

public class staticVariable {
	
	int nonStatic = 10;
	static int isStaticVariable = 100;
	
	public int getNonStatic() {
		return nonStatic;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVariable staticVariable_ = new staticVariable();
		System.out.println("Giá trị biến nonStatic: " + staticVariable_.getNonStatic());
		//gọi biến tĩnh bằng [tên lớp].[tên_thuộc_tính]
		System.out.println("Giá trị biến static: " + staticVariable.isStaticVariable);
	}

}

package interface_;
//interface Student kế thừa từ interface Person
public interface Student extends Person {
	//vì kế thừa nên nó có các phương thức của Person
	//và Student có thêm một phương thức
	void nhapDiem();

}

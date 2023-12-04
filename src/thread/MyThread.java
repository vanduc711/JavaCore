package thread;
//tạo một lớp kế thừa từ Thread
public class MyThread extends Thread{
	
	//chúng ta ghi đè phương thức run của Thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//dùng vòng lặp mỗi khi một luồng được chạy thì sẽ hiển thị 2 lần tên của luồng
		for(int i = 0; i < 2; i++) {
			//Thread.currentThread().getName() cho ta biết tên luồng đang chạy
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
        // Tạo ra luồng thread1 từ lớp MyThread       
		MyThread thread1 = new MyThread();
		thread1.start();
         
        // Tạo ra luồng myThread1 từ lớp MyThread       
		MyThread thread2 = new MyThread();
		thread2.start();
         
        // Tạo ra luồng myThread2 từ lớp MyThread    
		//sử dụng setName để thay đổi tên của luồng
		MyThread thread3 = new MyThread();
		thread3.setName("Luồng 3");
		thread3.start();
    }
	
	
	
}

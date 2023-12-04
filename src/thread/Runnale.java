package thread;

public class Runnale implements Runnable {
	
	private int shareVariable = 0;
	
	public int getRunnale() {
		return shareVariable;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//dùng vòng for lặp 3 lần sau mỗi lần tăng shareVariable lên 2
		for(int i = 0; i < 3; i++) {
			System.out.println("ID: " + Thread.currentThread().getId() 
					+  " , Name: " + Thread.currentThread().getName() 
					+ " shareVariable: " + shareVariable);
					shareVariable += 2;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnale runnable = new Runnale();
		
		Thread thread1 = new Thread(runnable);
		thread1.setName("Luồng 1");
		thread1.start();
		
		Thread thread2 = new Thread(runnable);
		thread2.setName("Luồng 2");
		thread2.start();
		
		Thread thread3 = new Thread(runnable);
		thread3.setName("Luồng 3");
		thread3.start();
	}

	

}

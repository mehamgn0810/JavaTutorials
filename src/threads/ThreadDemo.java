package threads;

class MyClass extends Thread {
	
	// Extend Thread class and implement run() method

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId() + " Value is: " + i);
		}
		
	}
	
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyClass thread1 = new MyClass();
		thread1.start();
		
		MyClass thread2 = new MyClass();
		thread2.start();
	}
}

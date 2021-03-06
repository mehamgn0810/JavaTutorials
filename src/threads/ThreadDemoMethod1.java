package threads;

//Extending Thread Class
class MyClass extends Thread {
	
	// Extend Thread class and override run() method

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId() + " Value is: " + i);
		}
		
	}
	
}

public class ThreadDemoMethod1 {
	public static void main(String[] args) {
		MyClass thread1 = new MyClass();
		thread1.start();
		
		MyClass thread2 = new MyClass();
		thread2.start();
	}
}

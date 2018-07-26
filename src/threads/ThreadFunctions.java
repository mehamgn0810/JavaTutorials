package threads;

public class ThreadFunctions {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		
		t1.start();
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t1.getPriority();
//		t1.setName("myFirstThread");
//		t1.getName();
//		Thread.currentThread();
//		t1.getId();
//		Thread.currentThread().getId();
//		Thread.yield();
		t2.start();
//		t2.setDaemon(true);
//		t2.isDaemon();
		
		
		
		

	}

}

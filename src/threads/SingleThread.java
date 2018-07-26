package threads;

//Passing new Runnable as Constructor and implementing run() in Runnable's constructor
public class SingleThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(Thread.currentThread().getId() + " Value is: " + i);
				}				
			}
		});
		
		t1.start();
	}
}



package finalfinallyfinalize;

public class FinalizeDemo {
	
	//finalize method will be executed automatically before garbage collection

	public static void main(String[] args) {
		
		FinalizeDemo f1 = new FinalizeDemo();
		FinalizeDemo f2 = new FinalizeDemo();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}
	
	public void finalize() {
		System.out.println("Inside finalize method");
	}

}

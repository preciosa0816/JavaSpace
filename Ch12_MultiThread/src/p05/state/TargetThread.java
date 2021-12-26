package p05.state;

public class TargetThread extends Thread {

	@Override
	public void run() {
		
		//Runnable
		for(int i =0; i<1000;i++) 
			System.out.print("a");
			
		
		//TIMED_WATING
		try {
			Thread.sleep(1500); 
			System.out.println("stop");
		} catch (InterruptedException e) {
			
		}
		
		
		
		//Runnable
		for(int i =0; i<1000;i++) 
			System.out.print("b");
			
		
	}
}

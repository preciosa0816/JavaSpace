package p01.basic2;

public class DigitThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
		}
	}
}

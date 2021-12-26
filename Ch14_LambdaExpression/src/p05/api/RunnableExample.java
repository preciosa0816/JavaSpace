package p05.api;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable run = ()-> {
				for(int i=0; i<10;i++) 
					System.out.print(i);
					
		};
		
		Thread thread = new Thread(run);
		thread.start();
		
		
		
		Thread th2 = new Thread(()-> {
				for(int i=0; i<10;i++) 
					System.out.print(i);

		});
		th2.start();

	}

}

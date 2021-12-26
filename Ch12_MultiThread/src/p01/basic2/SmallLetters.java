package p01.basic2;

public class SmallLetters implements Runnable {

	@Override
	public void run() {
		for(char ch = 'A';ch<'Z';ch++)
			System.out.print(ch);

	}

}

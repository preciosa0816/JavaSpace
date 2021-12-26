package p20.study.sync;
//메인클래스
public class MultithreadEx05 {

	public static void main(String[] args) {
		
		SharedArea s = new SharedArea();
		
		TransferThread trans = new TransferThread(s);
		
		PrintThread print = new PrintThread(s);
		
		trans.start();
		
		print.start();
	}

}

package p03.object.finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1;i<=50;i++) {
			counter=new Counter(i);
			
			counter = null; //Counter객체를 쓰레기로 만듦
			
			System.gc();	//쓰레기수집기 실행요청
								//전부 소멸시키는것이 아닌 무작위로 메모리의 상태를 보고 일부만 소멸시킴
		}

	}

}

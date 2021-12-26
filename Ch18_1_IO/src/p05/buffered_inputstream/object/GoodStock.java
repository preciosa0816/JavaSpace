package p05.buffered_inputstream.object;

import java.io.Serializable;

//직렬화가 가능한 클래스
public class GoodStock implements Serializable {// Serializable : 직렬화클래스를 만드려면 반드시 상속
	String code;
	int num;

	public GoodStock(String code, int num) {
		super();
		this.code = code;
		this.num = num;
	}
	//입고
	void addStock(int num) {
		this.num+=num; // 누적
	}
	//출고
	int subtractStock(int num) throws Exception {
		if(this.num<num)
			throw new Exception("재고가 부족합니다.");
		
		this.num-=num;
	
	return this.num;
	}
	
}

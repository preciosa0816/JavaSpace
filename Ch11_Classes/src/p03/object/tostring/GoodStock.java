package p03.object.tostring;
//상품재고
public class GoodStock {
	String goodsCode;
	int stockNum;
	
	public GoodStock(String goodsCode, int stockNum) {
		super();
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	//주소값 출력이 아닌 다른것을 출력시킬수 있게 만들기
	@Override
	public String toString() {
		String str = goodsCode+" : "+stockNum;
		return str; //변형된 값 출력시키기(문자열로 출력하기)
	}
	
}

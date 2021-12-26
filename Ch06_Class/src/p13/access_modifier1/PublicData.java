package p13.access_modifier1;

//public : class 앞에 , 변수 앞에, 메소드 앞에 사용. 생성자앞에 붙음
//			같은 패키지뿐만아니라 다른 패키지에서 접근 가능.
public class PublicData { // public 없으면 같은 패키지에서만 사용 가능
							// class 앞에 static 불가
	public int pubVar = 50;

	public int methodA() {
		return 100;
	}

	public PublicData(int pubVar) {
		super();
		this.pubVar = pubVar;
	}

	public PublicData() {

	}

	// 초기화블록은 public X
	{

	}
	static {

	}
}

		//public 사용불가
// public class AA{
// 	}
class AA {

}
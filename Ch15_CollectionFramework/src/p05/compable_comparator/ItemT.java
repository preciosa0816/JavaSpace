package p05.compable_comparator;

//Comparable:자연정렬(오름차순 정렬)
// ItemT class : comparable 인터페이스를 구현해야 오름차순이 된다.

//Default(오름차순 정렬)
public class ItemT implements Comparable<ItemT> {

	public int order = 0;

	public ItemT(int order) {
		super();
		this.order = order;
	}

	@Override
	public int compareTo(ItemT other) {// -1,0,1의 결과를 가짐
		if (this.order > other.order) { //오름차순 정의해놓음 부호를 바꾸면 내림차순
			return 1;
		} //
		else if (this.order == other.order) {
			return 0;
		} // 변동사항x
		else {
			return -1;
		} // 역순으로 변경

	}

}

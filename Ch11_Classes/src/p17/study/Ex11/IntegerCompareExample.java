package p17.study.Ex11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1=100;
		Integer obj11=new Integer(100);
		
		Integer obj2=100;
		Integer obj3=300;
		Integer obj4=300;
		
		//'==' : 숫자비교
		System.out.println(obj1==obj11);//false : 다른 객체로 인식
		System.out.println(obj1==obj2);//true : int는 박싱된 값이 -128~127사이의 값이라면 ==로 비교가능
		
		System.out.println(obj3==obj4);//false :그외는 언박싱한 후 비교해야함
		
		//'equals()' : 문자열비교, 객체 비교시 사용
		System.out.println(obj1.equals(obj2)); //동일 내용값 
		System.out.println(obj3.equals(obj4)); //동일 내용값
	}

}

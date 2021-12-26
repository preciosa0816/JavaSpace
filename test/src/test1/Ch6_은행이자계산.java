package test1;

public class Ch6_은행이자계산 {
	public static void main(String[] args) {
		double r = 0.05; //이자율 5%
		int m=100000; //원금
		int y=5; //총 거치기간

		double k=1; //이자율에 쓰일 변수
		int i=1;//반복변수
		double t; //예상금액
		while(i<=y) {
			k=k*(1+r);
			t=m*k;
			System.out.println(i+"년 => "+(int)t+"원");
			i++;
		}
	}
}

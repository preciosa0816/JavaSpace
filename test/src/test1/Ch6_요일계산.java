package test1;

public class Ch6_요일계산 { //1월 1일이 수요일이라 가정
	public static void main(String[] args) {
		int md[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		String wd[]= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일",};
		
		int m=3; //3월 입력 가정
		int d=8; // 8일 입력 가정
		
		if(d==0) return;
		
		int nal=0; //일의 차
		int dal=m-1; //월의 차
		if(dal!=0) { //같은 달이 아닐 때
			int i=0;
			do {
				nal+=md[i]; //차이나는 달의 날들을 더함
				i++;
			}while(i<=(dal-1));
		}
		nal=nal+d-1;
//		int v=nal/7;
//		v*=7;
//		int w=nal-v;
		int w=nal%7; 	//7일씩 나누고 남은 요일 (수요일에 더해질 숫자)
		int x=w+3; //수요일이라 3을 더함
		if(x>7) x-=7;
		
		System.out.println(m+"월"+d+"일 => "+wd[x-1]); //wd[0]부터 시작하므로 1빼기
	}
}

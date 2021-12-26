package test1;

public class Ch3_패리티비트검증 {

	public static void main(String[] args) {
		int p[]= {0,1,0,0,1,0,0,0,1};
		int check=0;
		for(int k=1;k<9;k++) {
			if(p[k]==1) {
				check+=1;
			}
		}
		int error=check%2;
		if(p[0]==error) {
			System.out.println("오류가 없습니다");
		}else {
			System.out.println("오류가 발생했습니다.");
		}
	}

}

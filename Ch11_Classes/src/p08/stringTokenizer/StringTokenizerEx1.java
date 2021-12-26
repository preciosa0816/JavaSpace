package p08.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		//구분자(delimiter): 앞데이터 뒤데이터를 구분
		//token: "자몽","오렌지","키위"
	
		String str = "자몽 오렌지 키위";
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			String t = st.nextToken();
			System.out.print(t+",");
		
			
		}
			System.out.println();
			
		String str2 = "자몽,오렌지,키위";
		StringTokenizer st2 = new StringTokenizer(str2 ,",");
		
		while(st2.hasMoreElements()) {
			String t2 = st2.nextToken();
			System.out.print(t2+" ");
			
		}
		
	}

}

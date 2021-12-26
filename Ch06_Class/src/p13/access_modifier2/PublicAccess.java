package p13.access_modifier2;

import p13.access_modifier1.PublicData;

public class PublicAccess {

	public static void main(String[] args) {
		PublicData pu = new PublicData();
		//1
		int result = pu.pubVar;
		System.out.println(result);
		//2
		System.out.println(pu.pubVar);
		
		//1
		int result2 = pu.methodA();
		System.out.println(result2);
		//2
		System.out.println(pu.methodA());
		

	}

}

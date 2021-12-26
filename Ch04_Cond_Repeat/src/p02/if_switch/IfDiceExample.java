package p02.if_switch;

public class IfDiceExample {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		//Math.random() : 0.0~0.999999의 임의값(불특정 값, 난수)
		//주사위 
		int num =(int)(Math.random()*6)+1;
								//int 0.0~5.**= 0~5, 그러므로 1을 더함 (1~6) 
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
			
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
			
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
			
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
			
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
			
		}else {
			System.out.println("6번이 나왔습니다.");
			
		}
		

	}

}

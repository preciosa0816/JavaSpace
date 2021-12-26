package p05.anonymous;

public class Player_Main {

	public static void main(String[] args) {
		
		//Annonymous Interface(익명구현객체)로 만들기
		Player p = new Player() {
			
			@Override
			public void stop() {
				System.out.println("플레이 종료.");
				
			}
			
			@Override
			public void play(String source) {
				System.out.println("플레이 시작 : "+source);
				
			}
		};

		p.stop();
		p.play("Genius");
	}

}

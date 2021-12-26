package p10.static_member;

public class HundredNumber_Main {
	public static void main(String[] args) {
		try {
			System.out.println(HundredNumbers.arr[20]);
			System.out.println(HundredNumbers.arr[99]);
			System.out.println(HundredNumbers.arr[100]);
		} catch (ArrayIndexOutOfBoundsException e) { //배열경계범위를 벗어난 경우의 예외
			// e.printStackTrace(); // 빨간글씨뜨게만듦
			System.out.println("'Error!' - 0~99까지 입력해주세요");
		} catch (Exception e) {
			// e.printStackTrace(); // 빨간글씨뜨게만듦
			System.out.println("일반적인 예외");
		}

	}
}
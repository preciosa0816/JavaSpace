package test1;

public class 예상문제17_346 {

	public static void main(String[] args) {
		String text = "Love is a variety of different feelings, states, and"
				+ "attitudes that ranges from interpersonal affection to pleasure.";
		int cnt = 0;
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) == 'a')
				cnt++;
		System.out.println("a문자 : " + cnt);

	}

}

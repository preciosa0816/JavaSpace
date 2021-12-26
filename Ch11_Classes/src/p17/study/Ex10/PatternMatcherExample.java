package p17.study.Ex10;
//정규화
import java.util.regex.Pattern;

public class PatternMatcherExample {
//첫번째는 알파벳으로 시작하고 두번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID값인지 검사하기
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp="[a-zA-Z]\\w{8,12}";//"[a-zA-Z]-{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

	}

}

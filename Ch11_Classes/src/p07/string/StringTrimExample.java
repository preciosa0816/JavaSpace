package p07.string;

public class StringTrimExample {
//앞뒤 공백 제거(trim())
	public static void main(String[] args) {
		String tel1 = "     02";
		String tel2="123       ";
		String tel3="      1234      ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);

	}

}
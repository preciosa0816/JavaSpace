package p15.format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "홍길동";
		String tel = "010-1234-1234";
		
		String text = "회원ID : {0}\n회원이름 : {1}\n회원전화 : {2}";
				
		String result1= MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"'java'", "'신용권'", "'010-123-5678'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}

}

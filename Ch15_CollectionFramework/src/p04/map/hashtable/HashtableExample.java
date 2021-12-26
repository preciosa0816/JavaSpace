package p04.map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String>  map = new Hashtable<String, String>();
		
		map.put("spring", "12");//아이디와 비밀번호를 미리 저장시킨다.
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);//키보드로부터 입력된 내용을 받기 위해 생성
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("ID : ");
			String id = sc.nextLine();//키보드로 입력한 아이디 읽기
			
			System.out.print("Password : ");
			String passwrod = sc.nextLine();//키보드로 입력한 비밀번호 읽기
			System.out.println();
			
			if(map.containsKey(id)) {//아이디가 존재하는지 확인
				if(map.get(id).equals(passwrod)){//비밀번호 비교
				System.out.println("Login");
				break;
				}else {
					System.out.println("wrong password");
				}
				
			}else {
				System.out.println("No ID");
			}
		}

	}

}

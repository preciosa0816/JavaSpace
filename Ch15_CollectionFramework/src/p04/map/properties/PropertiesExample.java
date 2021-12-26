package p04.map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		//현재 클래스의 리소스를 동원해서 외부에 있는 "database.properties"를 저장해라
		//프로퍼티 파일의 경로 얻기
		String path=PropertiesExample.class.getResource("database.properties").getPath(); 
		path=URLDecoder.decode(path,"utf-8");//utf-8: 경로에 한글이 있을 경우 한글을 복원
		p.load(new FileReader(path));//프로퍼티 파일로부터 데이터 읽기(안읽으면 밑의 내용 null)
		
		String driver = p.getProperty("driver");
		System.out.println("driver: "+driver);
		
	}

}

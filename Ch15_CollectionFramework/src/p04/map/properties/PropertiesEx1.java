package p04.map.properties;

import java.util.Enumeration;
import java.util.Properties;

//Properties는 Map계열(key,Value), 하나의 클래스 속성을 알려고 할 때 , 오직 String Type으로 제한됨
public class PropertiesEx1 {

	public static void main(String[] args) {
		//System.getProperties();를 실행하면 Properties에 저장하고 이 값을 p라고 함
		Properties p = System.getProperties();
		
		Enumeration<?>e= p.propertyNames(); 
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = (String) p.getProperty(key);
			System.out.println(key+" : "+value);
		}
		System.out.println();
		Properties p2= new Properties();
		p2.put("name", "홍길동");
		p2.put("addr", "마포구");
		p2.put("ad", "20");
		p2.put("nation", "한국");

		Enumeration<?>e2= p2.propertyNames(); 
		while(e2.hasMoreElements()) {
			String name = (String) e2.nextElement();
			String value = (String) p2.getProperty(name);
			System.out.println(name+":"+value);
		}
		
		
		
	
	}
	
	
	

}

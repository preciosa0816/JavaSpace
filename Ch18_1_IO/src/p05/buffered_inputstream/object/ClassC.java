package p05.buffered_inputstream.object;

import java.io.Serializable;
//클래스의 내용이 변경시 역직렬화로 예외 발생
//클래스를 재 컴파일 하면 serialVersionUID의 값이 달라지기 때문-> 역직렬화에 실패 
public class ClassC implements Serializable {
	int field1;
	int field2; //역직렬화
}

package p05.buffered_inputstream.object;

import java.io.Serializable;
//직렬화가 가능한 클래스 
public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	static int field3;//직렬화 제외
	transient int field4;//직렬화 제외
}

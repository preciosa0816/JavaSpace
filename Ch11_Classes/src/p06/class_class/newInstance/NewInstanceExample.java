package p06.class_class.newInstance;
//newInstance() : 동적 객체 생성, 코드작성시 클래스이름을 결정할 수 없고, 런타임 시에 클래스 이름이 결정되는 경우
public class NewInstanceExample {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("p06.class_class.newInstance.SendAction");
			//Class clazz = Class.forName("p06.class_class.newInstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
		
	}

}

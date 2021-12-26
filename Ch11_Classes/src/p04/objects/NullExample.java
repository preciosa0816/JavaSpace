package p04.objects;

import java.util.Objects;

//널(null) 여부 조사
public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		
		try {//requireNonNull(T obj):not null->obj / null->NullPointerException
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {//requireNonNull(T obj,String message):not null->obj 
																	// null->NullPointerException(message)
			String name = Objects.requireNonNull(str2,"이름이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		try {//requireNonNull(T obj, Supplier<String>msgSupplier):not null->obj 
											//null->NullPointerException(msgSupplier.get())
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요"); //람다식
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

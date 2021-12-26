package p05.api.and_or_negate;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		Predicate<String> predicate; //현재 null
		
		predicate = Predicate.isEqual(null); //null+null=true
		System.out.println("null, null : "+predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");//null+notnull=false
		System.out.println("null, Java8 : "+predicate.test(null));
		
		predicate = Predicate.isEqual(null);//notnull+null=false
		System.out.println("Java8, null : "+predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");//notnull+notnull=true
		System.out.println("Java8, Java8 : "+predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");//Java7 =!Java8
		System.out.println("Java7 , Java8 : "+predicate.test("Java7") );
	}

}

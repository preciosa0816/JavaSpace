package p01.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalLambda_Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("dog", 4);
		Animal a2 = new Animal("pig", 2);
		Animal a3 = new Animal("snake", 8);

		List<Animal> an = new ArrayList<Animal>();
		an.add(a1);
		an.add(a2);
		an.add(a3);
		
		System.out.println("입력순 : "+an);
		//오름차순
		//Comparator : 함수적 인터페이스(lambda expression)가능
		//sort(List<T> list, Comparator<? super T> c); //COmparator : 함수인터페이스-람다가능
		Collections.sort(an, (a,b)->a.age-b.age); 
		System.out.println("오름차순 : "+an);
		
		//내림차순
		Collections.sort(an, (a,b)->b.age-a.age); 
		System.out.println("내림차순 : "+an);
		
		
	}

}

package p06.array;

public class Array_Dog {

	public static void main(String[] args) {
		//Dog d0 = new Dog(); //객체생성
		Dog d[] = new Dog[3];//배열생성
		
		//"워리" , "불독"
		d[0]=new Dog("워리" , "불독");
		System.out.println(d[0].kind);
		System.out.println(d[0].name+":"+d[0].kind);
		
		//"진도개" , "진도"
		d[1]=new Dog("진도개" , "진도");
		System.out.println(d[1].name+":"+d[1].kind);
		
		//"풍산개", " 풍산"
		d[2]=new Dog("풍산개", "풍산");
		System.out.println(d[2].name+":"+d[2].kind);
		
		
		
		  for (int i=0; i<d.length; i++) { 
			  System.out.println(d[i].name+" : "+d[i].kind); 
			  }
		  
		 for(Dog a: d) {
			 System.out.println(a.name+" : "+a.kind);
		 }
		

	}

}

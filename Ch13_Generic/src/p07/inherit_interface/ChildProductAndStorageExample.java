package p07.inherit_interface;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		
		//상속
		ChildProduct<Tv, String, String> cp = new ChildProduct<>();
		cp.setKind(new Tv());
		cp.setModel("model");
		cp.setCompany("Samsung");
		
		System.out.println(cp.getKind());
		System.out.println(cp.getModel());
		System.out.println(cp.getCompany());
		
		
		//구현
		Storage<Integer> s = new StorageImpl<Integer>(100);
		s.add(999999,1);
		System.out.println(s.get(1));
		Storage<Tv> tv = new StorageImpl<Tv>(100);
		tv.add(new Tv(), 0);
		
		Tv tt =tv.get(0);
		System.out.println(tt);
		//"aaa" : tostring에서 재정의해옴
		
	

}
}

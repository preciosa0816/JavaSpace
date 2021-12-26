package p13.access_modifier1;

public class DefaultAccess2 {

	public static void main(String[] args) {
		DefaultData de = new DefaultData();
		System.out.println(de.defaultVar);
		System.out.println(de.method());
	}

}

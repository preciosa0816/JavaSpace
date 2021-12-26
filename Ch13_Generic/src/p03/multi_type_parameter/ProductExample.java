package p03.multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setKind(new Tv("tv"));
		p1.setModel("Smart Tv");
		Tv tv = p1.getKind();
		String tvModel = p1.getModel();
		System.out.println(tv+" : "+tvModel);
		
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setKind(new Car("car"));
		p2.setModel("디젤");
		Car car = p2.getKind();
		String carModel = p2.getModel();
		System.out.println(car+" : "+carModel);
	}

}

package p16.study.example18;

public class ShopService {
	private static ShopService s = new ShopService();
	
	private ShopService() {
		
	}

	public static ShopService getInstance() {
		
		return s;
	}

}

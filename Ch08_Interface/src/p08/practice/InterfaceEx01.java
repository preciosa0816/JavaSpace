package p08.practice;

public class InterfaceEx01 {

	public static void main(String[] args) {
		SeperateVolume obj1=new SeperateVolume("86738개","개미","베르베르");
		AppCDInfo obj2= new AppCDInfo("2018-9001", "Spring");
		obj1.checkOut("홍길여", "20180611");
		obj2.checkOut("박삼수", "20180319");
		obj1.checkln();
		obj2.checkln();

	}

}

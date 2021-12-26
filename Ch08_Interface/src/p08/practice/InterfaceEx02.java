package p08.practice;

public class InterfaceEx02 {
	
		public static void main(String[] args) {
			Lendable arr[] = new Lendable[3];
			arr[0] = new SeperateVolume("88332", "푸코의 진자", "에코");
			arr[1] = new SeperateVolume("69933", "서양의 미술사", "곰브리치");
			arr[2] = new AppCDInfo("02-17","Spring3.0");
			checkOutAll(arr,"김내리", "20140709");
		}
		static void checkOutAll(Lendable arr[], String borrower, String date) {
			for (int cnt = 0; cnt < arr.length; cnt++)
				arr[cnt].checkOut(borrower, date);
		}
}

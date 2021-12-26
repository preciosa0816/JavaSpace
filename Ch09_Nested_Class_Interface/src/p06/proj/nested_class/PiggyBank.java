package p06.proj.nested_class;

public class PiggyBank {
	int total;
	Slot slot;
	
	public PiggyBank() {
		total = 0;
		slot = new Slot();
	}

	class Slot {
		void put(int amount) {
			total += amount;
		}
	}
}

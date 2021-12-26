package p03.object.hashcode;

public class Key {
	int number;

	public Key(int number) {
		//super();
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() { 

		return number; //*********************************왜 number.hashcode()안됨??
	}

}

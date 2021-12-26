package p03.object.clone;

public class Rectangle implements Cloneable {
	int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	protected Object clone() {

		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			if(this.width==r.width&&this.height==r.height) {
				return true;
			}
		}
		return false;
	}
	
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return width+height;
//	}
}

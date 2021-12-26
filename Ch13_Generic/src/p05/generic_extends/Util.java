package p05.generic_extends;
//<T extends 최상위타입>
public class Util {
	
//T: number ,	byte,	double,	float,	integer,	long,	short
	public static <T extends Number> int compare (T t1, T t2) {
		double v1=t1.doubleValue();
		double v2=t2.doubleValue();
		
		
		return Double.compare(v1, v2); //-1,0,1
							//compare(a,b):a>b이면 1, a=b이면 0, a<b이면 -1
	}
}

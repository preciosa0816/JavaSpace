package p03.object.equals;
//Circle c1;
public class Circle {

		int radius;

		public Circle(int radius) {
			super();
			this.radius = radius;
		}
		
		
		//재정의 : 우리가 만든 클래스 비교인 경우 반드시 재정의 해야 " 같은 객체다"라고 확인
		@Override
		public boolean equals(Object obj) { //obj:c2 
			
			if(!(obj instanceof Circle))//형변환 가능 여부 확인하는 연산자
					return false;
			Circle c = (Circle) obj; //Casting
			if(this.radius==c.radius) { //c1==c2 숫자비교
				return true;
			}
			else 
				return false;
				}
		
		}


package p01.basic;

public class MethodEx {

		int a=1;
		static double b=0;
		
		public static void main(String[] args) {
			
			MethodEx m = new MethodEx();
					
			System.out.println(m.a);
			System.out.println(b);
			System.out.println(m.add(1,20.0));
			System.out.println("----------------");
			System.out.println(MethodEx.b);
			
			//m.add(1, 20.0); //화면에 안나옴
			double result = m.add(1, 20.0); //Argument //SwitchEx1과 비교하기
			System.out.println(result);
			
			
			
			// m.a ->error , 소속이 없기 때문
			// int aa= m.a; //int 삽입함 ->error 사라짐
			// System.out.println(aa); // 이렇게도 가능
			System.out.println("------------------------");
			System.out.println(args[0]);
			System.out.println(args[1]); //run - configuration-args에 "10", "20" 넣어놓음
			System.out.println(args[0]+20); //문자열 '10'+'20' =1020
			System.out.println(Integer.valueOf(args[0]) +20); // 숫자로 바꿔서 더하게함
			System.out.println(Integer.parseInt(args[0]) +20); //
			int r = Integer.parseInt(args[0]);
			System.out.println(r+20);//30
			
			
		}
		
		double add(int k, double d) {//1,20.0 //double add~ 파라미터변수
			double t =k+d;
			return t;

		}

	

}

package p05.trywithresources;
//try~with~resources : java7 이후의 new try catch
//								close() 필요 없음 -> 자동으로 닫힘
public class TryWithResources {

	public static void main(String[] args) {
		
			
		try(FileInputSteam fis=new FileInputSteam("file.txt");) {
			
			fis.read();
			throw new Exception();//강제적인 예외 발생 : checked Exception
		} catch (Exception e) {
			System.out.println("예외처리 코드가 시행되었습니다.");	
		}
		

	}

}

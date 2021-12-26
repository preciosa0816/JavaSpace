package p05.trywithresources;

public class FileInputStream_old {

	public static void main(String[] args) {
		
		FileInputSteam fis = null;
		
		try {
			fis=new FileInputSteam("file.txt");
			fis.read();
			throw new Exception();//강제적인 예외 발생 : checked Exception
		} catch (Exception e) {
			System.out.println("예외처리 코드가 시행되었습니다.");
		}
		try {
			fis.close();
		} catch (Exception e) {
			
		}
		

	}

}

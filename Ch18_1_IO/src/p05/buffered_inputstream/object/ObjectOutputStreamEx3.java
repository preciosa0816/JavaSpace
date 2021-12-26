package p05.buffered_inputstream.object;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//직렬화
public class ObjectOutputStreamEx3 {
	
	public static void main(String[] args) {	
		
		ObjectOutputStream os = null;
		try {
			FileOutputStream fo = new FileOutputStream("obj3.dat");
			os = new ObjectOutputStream(fo);
			BBSItem bi =new BBSItem("홍길동", "1234", "정모합니다", "이번주?");					
			os.writeObject(bi);			
			System.out.println("전체 게시물 수 : "+bi.itemNum);
			System.out.println("글쓴이 : "+bi.writer);
			System.out.println("PW : "+bi.password);
			System.out.println("제목 : "+bi.title);
			System.out.println("내용 : "+bi.content);
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

		try {
			os.close();
		} catch (IOException e) {

		}


	}

}

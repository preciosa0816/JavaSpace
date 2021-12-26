package p05.trywithresources;

public class FileInputSteam implements AutoCloseable { //자동닫기

	private String file;
	
	
	public FileInputSteam(String file) {
		super();
		this.file = file;
	}
	public void read() {
		System.out.println(file+"을 읽었습니다.");
	}


	@Override
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
		
	}

}

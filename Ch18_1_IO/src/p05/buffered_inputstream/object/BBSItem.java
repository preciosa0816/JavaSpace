package p05.buffered_inputstream.object;

import java.io.Serializable;

public class BBSItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//scm관리.
	static int itemNum = 0; // 게시물의 수 ,직렬화 불가능(static)
	String writer;// 글쓴이
	transient String password;// 직렬화 불가능(transient)
	String title;
	String content;

	public BBSItem(String writer, String password, String title, String content) {
		super();
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;

		itemNum++; // 게시물이 생성될떄마다 증가
	}

	void modifyContent(String content, String password) {
		if (!password.equals(this.password))
			return;
		this.content = content;

	}

}

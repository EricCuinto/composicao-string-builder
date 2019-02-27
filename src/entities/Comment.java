package entities;

public class Comment {

	private String text;

	// **************Construtores***************

	public Comment() {
	}

	public Comment(String text) {
		this.text = text;
	}

	// ***************** GET/SET ***************
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

package br.com.erudio.restwithspringbootandjavaerudio;

public class Greeting {
	private final long id;
	
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	private long getId() {
		return id;
	}

	private String getContent() {
		return content;
	}
}
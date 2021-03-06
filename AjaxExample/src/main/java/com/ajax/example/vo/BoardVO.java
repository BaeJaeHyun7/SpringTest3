package com.ajax.example.vo;

public class BoardVO {
	
	private int boardNum;
	private String title;
	private String writer;
	private String content;
	private String indate;
	
	public BoardVO() {

	}

	public BoardVO(int boardNum, String title, String writer, String content, String indate) {
		super();
		this.boardNum = boardNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.indate = indate;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", indate=" + indate + "]";
	}
	
	
}

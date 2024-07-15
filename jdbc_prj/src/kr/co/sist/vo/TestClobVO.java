package kr.co.sist.vo;

import java.sql.Date;

public class TestClobVO {
	private int num;
	private String title,content,wrietr;
	private Date input_date;
	
	public TestClobVO() {
	}

	
	
	public TestClobVO(int num, String title, String content, String wrietr, Date input_date) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.wrietr = wrietr;
		this.input_date = input_date;
	}
	

	@Override
	public String toString() {
		return "TestClobVO [num=" + num + ", title=" + title + ", content=" + content + ", wrietr=" + wrietr
				+ ", input_date=" + input_date + "]";
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getWrietr() {
		return wrietr;
	}



	public void setWrietr(String wrietr) {
		this.wrietr = wrietr;
	}



	public Date getInput_date() {
		return input_date;
	}



	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}



    
	
	
	
}

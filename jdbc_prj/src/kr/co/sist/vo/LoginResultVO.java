package kr.co.sist.vo;

import java.sql.Date;

public class LoginResultVO {
	private String name;
	private Date input_Date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getInput_Date() {
		return input_Date;
	}
	public void setInput_Date(Date input_Date) {
		this.input_Date = input_Date;
	}
	@Override
	public String toString() {
		return "LoginResultVO [name=" + name + ", input_Date=" + input_Date + "]";
	}
	public LoginResultVO(String name, Date input_Date) {
		super();
		this.name = name;
		this.input_Date = input_Date;
	}
	
	public LoginResultVO() {
		// TODO Auto-generated constructor stub
	}
}

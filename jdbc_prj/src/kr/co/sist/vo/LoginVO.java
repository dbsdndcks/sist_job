package kr.co.sist.vo;

public class LoginVO {
	private String id;
	private String pass;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}
	public LoginVO(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", pass=" + pass + "]";
	}
	
	
}

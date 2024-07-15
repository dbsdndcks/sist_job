package day0423;

public class UrlVO {
	String code;
	String url;
	String info;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public UrlVO(String code, String url, String info) {
		super();
		this.code = code;
		this.url = url;
		this.info = info;
	}

	
	
}

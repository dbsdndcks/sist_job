package course_prj_design.manager;

public class AdminVO {
	private String id;
	private String password;
	private String name;
	private int chMod;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChMod() {
		return chMod;
	}
	public void setChMod(int chMod) {
		this.chMod = chMod;
	}
	
	public AdminVO() {
		// TODO Auto-generated constructor stub
	}
	public AdminVO(String id, String password, String name, int chMod) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.chMod = chMod;
	}
	public AdminVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
}

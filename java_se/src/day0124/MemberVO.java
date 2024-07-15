package day0124;


public class MemberVO {
	private int studentNum;
	private String name;
	private int java;
	private int oracle;
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
	
	public MemberVO() {
	}
	public MemberVO(int studentNum, String name, int java, int oracle) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.java = java;
		this.oracle = oracle;
	}
	
    @Override
    public String toString() {
        // 원하는 포맷으로 문자열 반환
        return studentNum + "\t" + name + "\t" + java + "\t" + oracle + "\t" + calculateTotal() + "\t" + calculateAverage();
    }
	private int calculateAverage() {		
		return java+oracle;
	}
	private double calculateTotal() {
		return (java+oracle)/2.0;
	}
	
	
}

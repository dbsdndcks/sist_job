package kr.co.sist.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class CpEmpDomain {
	private int  empno, sal, comm,  deptno;
	private String ename,hiredateStr,job;
	private Date hiredate2;
	
	public CpEmpDomain() {
		System.out.println("CpEmpDomain 기본생성자");
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("setName 설정 값" + ename);
		this.ename = ename;
	}
	public String getHiredateStr() {
		return hiredateStr;
	}
	public void setHiredateStr(String hiredateStr) {
		this.hiredateStr = hiredateStr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate2() {
		return hiredate2;
	}
	public void setHiredate2(Date hiredate2) {
		this.hiredate2 = hiredate2;
	}
	public CpEmpDomain(int empno, int sal, int comm, int deptno, String ename, String hiredateStr, String job,
			Date hiredate2) {
		System.out.println("매개변수있는 생성자");
		this.empno = empno;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.ename = ename;
		this.hiredateStr = hiredateStr;
		this.job = job;
		this.hiredate2 = hiredate2;
	}

	@Override
	public String toString() {
		return "CpEmpDomain [empno=" + empno + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + ", ename="
				+ ename + ", hiredateStr=" + hiredateStr + ", job=" + job + ", hiredate2=" + hiredate2 + "]";
	}
	
	
}

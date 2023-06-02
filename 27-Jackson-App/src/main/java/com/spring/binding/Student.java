package com.spring.binding;

public class Student {
	
	private int sid;
	private String sname;
	private int srank;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSrank() {
		return srank;
	}
	public void setSrank(int srank) {
		this.srank = srank;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", srank=" + srank + "]";
	}
	
	

}

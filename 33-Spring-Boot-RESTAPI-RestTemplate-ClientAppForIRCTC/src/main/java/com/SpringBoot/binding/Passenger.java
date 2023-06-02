package com.SpringBoot.binding;

public class Passenger {
	
	private String email;
	private String from;
	private String jdate;
	private String name;
	private String to;
	private Integer trainNum;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [email=" + email + ", from=" + from + ", jdate=" + jdate + ", name=" + name + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}
	

}

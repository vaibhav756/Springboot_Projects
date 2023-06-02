package com.SpringBoot.binding;

public class Ticket {

	private String name;
	private String email;
	private String from;
	private String to;
	private Long trainNum;
	private Integer ticketNo;
	private String trainTime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Long getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Long trainNum) {
		this.trainNum = trainNum;
	}
	public Integer getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Integer ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getTrainTime() {
		return trainTime;
	}
	public void setTrainTime(String trainTime) {
		this.trainTime = trainTime;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", trainNum=" + trainNum
				+ ", ticketNo=" + ticketNo + ", trainTime=" + trainTime + "]";
	}
	
}

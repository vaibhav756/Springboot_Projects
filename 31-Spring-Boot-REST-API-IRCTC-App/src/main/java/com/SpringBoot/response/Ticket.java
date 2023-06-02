package com.SpringBoot.response;

public class Ticket {

	private String name;
	private String email;
	private long phno;
	private String from;
	private String to;
	private String jdate;
	private long trainNum;
	private String ticketNum;
	private String ticketStatus;
	private Double ticketPrice;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
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
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public long getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(long trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", email=" + email + ", phno=" + phno + ", from=" + from + ", to=" + to
				+ ", jdate=" + jdate + ", trainNum=" + trainNum + ", ticketNum=" + ticketNum + ", ticketStatus="
				+ ticketStatus + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
	
	
}

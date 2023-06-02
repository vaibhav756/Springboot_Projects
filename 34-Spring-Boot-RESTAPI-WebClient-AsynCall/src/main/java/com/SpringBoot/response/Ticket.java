package com.SpringBoot.response;

public class Ticket {

	private String ticketNum;
	private String from;
	private String jdate;
	private String name;
	private String to;
	private Integer trainNum;
	private Integer ticketPrice;
	private String ticketStatus;
	public String getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
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
	public Integer getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + ", from=" + from + ", jdate=" + jdate + ", name=" + name + ", to="
				+ to + ", trainNum=" + trainNum + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus
				+ "]";
	}
	
	
	
}

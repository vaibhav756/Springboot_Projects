package com.SpringBoot.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private Double price;
	private String jdate;
	private Integer trainNum;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", price=" + price + ", jdate="
				+ jdate + ", trainNum=" + trainNum + "]";
	}
	
	

}

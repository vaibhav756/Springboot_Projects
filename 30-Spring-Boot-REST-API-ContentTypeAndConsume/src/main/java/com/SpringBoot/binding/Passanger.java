package com.SpringBoot.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passanger {

	private String name;
	private String email;
	private String from;
	private String to;
	private Long trainNum;
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
	@Override
	public String toString() {
		return "Passanger [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", trainNum="
				+ trainNum + "]";
	}
	
}

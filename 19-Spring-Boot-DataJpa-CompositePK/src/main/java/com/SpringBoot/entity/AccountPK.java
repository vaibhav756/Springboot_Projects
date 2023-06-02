package com.SpringBoot.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountPK implements Serializable{

	private Integer accId;
	private String accType;
	private String holderName;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public String toString() {
		return "AccountPK [accId=" + accId + ", accType=" + accType + ", holderName=" + holderName + ", getAccId()="
				+ getAccId() + ", getAccType()=" + getAccType() + ", getHolderName()=" + getHolderName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}

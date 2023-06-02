package com.SpringBoot.binding;

public class StockPrice {
	
	private Integer stockId;
	private String companyName;
	private Double companyPrice;
	private String portNumber;
	
	public String getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getCompanyPrice() {
		return companyPrice;
	}
	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}
	@Override
	public String toString() {
		return "StockPrice [stockId=" + stockId + ", companyName=" + companyName + ", companyPrice=" + companyPrice
				+ ", portNumber=" + portNumber + "]";
	}

}

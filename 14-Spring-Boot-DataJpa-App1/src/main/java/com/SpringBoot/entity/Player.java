package com.SpringBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYERS")
public class Player {

	@Id
	@Column(name="PLAYER_ID")
	private Integer playerId;
	
	@Column(name="PLAYER_NAME")
	private String playerName;
	
	@Column(name="PLAYER_GENDER")
	private String playerGender;
	
	@Column(name="PLAYER_AGE")
	private Integer playerAge;
	
	@Column(name="PLAYER_CITY")
	private String playerCity;
	
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setPlayerGender(String playerGender) {
		this.playerGender = playerGender;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerGender=" + playerGender
				+ ", playerAge=" + playerAge + ", playerCity=" + playerCity + "]";
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getPlayerGender() {
		return playerGender;
	}
	public Integer getPlayerAge() {
		return playerAge;
	}
	public String getPlayerCity() {
		return playerCity;
	}
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	public void setPlayerCity(String playerCity) {
		this.playerCity = playerCity;
	}
	
}

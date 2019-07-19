package com.entity;

import java.util.Date;

/**
 * Refurdform entity. @author MyEclipse Persistence Tools
 */

public class Refurdform implements java.io.Serializable {

	// Fields

	private Integer refurdformId;
	private Goods goods;
	private Users users;
	private Double refurdAmount;
	private String refurdReason;
	private Date applicationTime;
	private String refurdNumber;
	private String refurdStatus;

	// Constructors

	/** default constructor */
	public Refurdform() {
	}

	/** full constructor */
	public Refurdform(Integer refurdformId, Goods goods, Users users, Double refurdAmount, String refurdReason,
			Date applicationTime, String refurdNumber, String refurdStatus) {
		this.refurdformId = refurdformId;
		this.goods = goods;
		this.users = users;
		this.refurdAmount = refurdAmount;
		this.refurdReason = refurdReason;
		this.applicationTime = applicationTime;
		this.refurdNumber = refurdNumber;
		this.refurdStatus = refurdStatus;
	}

	// Property accessors

	public Integer getRefurdformId() {
		return this.refurdformId;
	}

	public void setRefurdformId(Integer refurdformId) {
		this.refurdformId = refurdformId;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Double getRefurdAmount() {
		return this.refurdAmount;
	}

	public void setRefurdAmount(Double refurdAmount) {
		this.refurdAmount = refurdAmount;
	}

	public String getRefurdReason() {
		return this.refurdReason;
	}

	public void setRefurdReason(String refurdReason) {
		this.refurdReason = refurdReason;
	}

	public Date getApplicationTime() {
		return this.applicationTime;
	}

	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getRefurdNumber() {
		return this.refurdNumber;
	}

	public void setRefurdNumber(String refurdNumber) {
		this.refurdNumber = refurdNumber;
	}

	public String getRefurdStatus() {
		return this.refurdStatus;
	}

	public void setRefurdStatus(String refurdStatus) {
		this.refurdStatus = refurdStatus;
	}

}
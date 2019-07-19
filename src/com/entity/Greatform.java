package com.entity;

import java.util.Date;

/**
 * Greatform entity. @author MyEclipse Persistence Tools
 */

public class Greatform implements java.io.Serializable {

	// Fields

	private Integer greatId;
	private Evaluateform evaluateform;
	private Users users;
	private Integer greatNumber;
	private Date greatTime;

	// Constructors

	/** default constructor */
	public Greatform() {
	}

	/** full constructor */
	public Greatform(Integer greatId, Evaluateform evaluateform, Users users, Integer greatNumber, Date greatTime) {
		this.greatId = greatId;
		this.evaluateform = evaluateform;
		this.users = users;
		this.greatNumber = greatNumber;
		this.greatTime = greatTime;
	}

	// Property accessors

	public Integer getGreatId() {
		return this.greatId;
	}

	public void setGreatId(Integer greatId) {
		this.greatId = greatId;
	}

	public Evaluateform getEvaluateform() {
		return this.evaluateform;
	}

	public void setEvaluateform(Evaluateform evaluateform) {
		this.evaluateform = evaluateform;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getGreatNumber() {
		return this.greatNumber;
	}

	public void setGreatNumber(Integer greatNumber) {
		this.greatNumber = greatNumber;
	}

	public Date getGreatTime() {
		return this.greatTime;
	}

	public void setGreatTime(Date greatTime) {
		this.greatTime = greatTime;
	}

}
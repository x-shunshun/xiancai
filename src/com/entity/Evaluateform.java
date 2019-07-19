package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Evaluateform entity. @author MyEclipse Persistence Tools
 */

public class Evaluateform implements java.io.Serializable {

	// Fields

	private Integer evaluateId;
	private Orderform orderform;
	private Users users;
	private String evaluatestatus;
	private String content;
	private Date evaluateTime;
	private Set greatforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Evaluateform() {
	}

	/** minimal constructor */
	public Evaluateform(Integer evaluateId, Orderform orderform, Users users, String evaluatestatus, String content,
			Date evaluateTime) {
		this.evaluateId = evaluateId;
		this.orderform = orderform;
		this.users = users;
		this.evaluatestatus = evaluatestatus;
		this.content = content;
		this.evaluateTime = evaluateTime;
	}

	/** full constructor */
	public Evaluateform(Integer evaluateId, Orderform orderform, Users users, String evaluatestatus, String content,
			Date evaluateTime, Set greatforms) {
		this.evaluateId = evaluateId;
		this.orderform = orderform;
		this.users = users;
		this.evaluatestatus = evaluatestatus;
		this.content = content;
		this.evaluateTime = evaluateTime;
		this.greatforms = greatforms;
	}

	// Property accessors

	public Integer getEvaluateId() {
		return this.evaluateId;
	}

	public void setEvaluateId(Integer evaluateId) {
		this.evaluateId = evaluateId;
	}

	public Orderform getOrderform() {
		return this.orderform;
	}

	public void setOrderform(Orderform orderform) {
		this.orderform = orderform;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getEvaluatestatus() {
		return this.evaluatestatus;
	}

	public void setEvaluatestatus(String evaluatestatus) {
		this.evaluatestatus = evaluatestatus;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEvaluateTime() {
		return this.evaluateTime;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public Set getGreatforms() {
		return this.greatforms;
	}

	public void setGreatforms(Set greatforms) {
		this.greatforms = greatforms;
	}

}
package com.entity;

/**
 * Storeconcern entity. @author MyEclipse Persistence Tools
 */

public class Storeconcern implements java.io.Serializable {

	// Fields

	private Integer concernId;
	private Goodstore goodstore;
	private Users users;

	// Constructors

	/** default constructor */
	public Storeconcern() {
	}

	/** full constructor */
	public Storeconcern(Integer concernId, Goodstore goodstore, Users users) {
		this.concernId = concernId;
		this.goodstore = goodstore;
		this.users = users;
	}

	// Property accessors

	public Integer getConcernId() {
		return this.concernId;
	}

	public void setConcernId(Integer concernId) {
		this.concernId = concernId;
	}

	public Goodstore getGoodstore() {
		return this.goodstore;
	}

	public void setGoodstore(Goodstore goodstore) {
		this.goodstore = goodstore;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
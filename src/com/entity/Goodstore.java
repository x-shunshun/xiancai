package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodstore entity. @author MyEclipse Persistence Tools
 */

public class Goodstore implements java.io.Serializable {

	// Fields

	private Integer storeId;
	private Users users;
	private String storeName;
	private Set storeconcerns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodstore() {
	}

	/** minimal constructor */
	public Goodstore(Integer storeId, Users users, String storeName) {
		this.storeId = storeId;
		this.users = users;
		this.storeName = storeName;
	}

	/** full constructor */
	public Goodstore(Integer storeId, Users users, String storeName, Set storeconcerns) {
		this.storeId = storeId;
		this.users = users;
		this.storeName = storeName;
		this.storeconcerns = storeconcerns;
	}

	// Property accessors

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Set getStoreconcerns() {
		return this.storeconcerns;
	}

	public void setStoreconcerns(Set storeconcerns) {
		this.storeconcerns = storeconcerns;
	}

}
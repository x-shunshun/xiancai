package com.entity;

/**
 * Goodcollection entity. @author MyEclipse Persistence Tools
 */

public class Goodcollection implements java.io.Serializable {

	// Fields

	private Integer collectionId;
	private Goods goods;
	private Users users;

	// Constructors

	/** default constructor */
	public Goodcollection() {
	}

	/** full constructor */
	public Goodcollection(Integer collectionId, Goods goods, Users users) {
		this.collectionId = collectionId;
		this.goods = goods;
		this.users = users;
	}

	// Property accessors

	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
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

}
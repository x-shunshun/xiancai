package com.entity;

/**
 * Shoppingcart entity. @author MyEclipse Persistence Tools
 */

public class Shoppingcart implements java.io.Serializable {

	// Fields

	private Integer carId;
	private Goods goods;
	private Users users;
	private Integer goodnumber;
	private Double total;

	// Constructors

	/** default constructor */
	public Shoppingcart() {
	}

	/** full constructor */
	public Shoppingcart(Integer carId, Goods goods, Users users, Integer goodnumber, Double total) {
		this.carId = carId;
		this.goods = goods;
		this.users = users;
		this.goodnumber = goodnumber;
		this.total = total;
	}

	// Property accessors

	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
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

	public Integer getGoodnumber() {
		return this.goodnumber;
	}

	public void setGoodnumber(Integer goodnumber) {
		this.goodnumber = goodnumber;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
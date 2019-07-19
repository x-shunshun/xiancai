package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orderform entity. @author MyEclipse Persistence Tools
 */

public class Orderform implements java.io.Serializable {

	// Fields

	private Integer orderformId;
	private Goods goods;
	private Users users;
	private Double goodsPrice;
	private Integer goodsNum;
	private String userName;
	private String userTel;
	private String userAdd;
	private Date buyTime;
	private Date getTime;
	private String formStatus;
	private String logisticsNumber;
	private Set evaluateforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderform() {
	}

	/** minimal constructor */
	public Orderform(Integer orderformId, Goods goods, Users users, Double goodsPrice, Integer goodsNum,
			String userName, String userTel, String userAdd, Date buyTime) {
		this.orderformId = orderformId;
		this.goods = goods;
		this.users = users;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.userName = userName;
		this.userTel = userTel;
		this.userAdd = userAdd;
		this.buyTime = buyTime;
	}

	/** full constructor */
	public Orderform(Integer orderformId, Goods goods, Users users, Double goodsPrice, Integer goodsNum,
			String userName, String userTel, String userAdd, Date buyTime, Date getTime, String formStatus,
			String logisticsNumber, Set evaluateforms) {
		this.orderformId = orderformId;
		this.goods = goods;
		this.users = users;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.userName = userName;
		this.userTel = userTel;
		this.userAdd = userAdd;
		this.buyTime = buyTime;
		this.getTime = getTime;
		this.formStatus = formStatus;
		this.logisticsNumber = logisticsNumber;
		this.evaluateforms = evaluateforms;
	}

	// Property accessors

	public Integer getOrderformId() {
		return this.orderformId;
	}

	public void setOrderformId(Integer orderformId) {
		this.orderformId = orderformId;
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

	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAdd() {
		return this.userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public Date getBuyTime() {
		return this.buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Date getGetTime() {
		return this.getTime;
	}

	public void setGetTime(Date getTime) {
		this.getTime = getTime;
	}

	public String getFormStatus() {
		return this.formStatus;
	}

	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
	}

	public String getLogisticsNumber() {
		return this.logisticsNumber;
	}

	public void setLogisticsNumber(String logisticsNumber) {
		this.logisticsNumber = logisticsNumber;
	}

	public Set getEvaluateforms() {
		return this.evaluateforms;
	}

	public void setEvaluateforms(Set evaluateforms) {
		this.evaluateforms = evaluateforms;
	}

}